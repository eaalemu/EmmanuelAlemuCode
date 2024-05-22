from google.cloud import speech
from google.cloud import translate_v2 as translate
import os

# Set up Google Cloud credentials
os.environ["GOOGLE_APPLICATION_CREDENTIALS"] = "path_to_your_credentials.json"

# Initialize the clients
speech_client = speech.SpeechClient()
translate_client = translate.Client()

def transcribe_audio(audio_file_path):
    with open(audio_file_path, "rb") as audio_file:
        content = audio_file.read()

    audio = speech.RecognitionAudio(content=content)
    config = speech.RecognitionConfig(
        encoding=speech.RecognitionConfig.AudioEncoding.LINEAR16,
        sample_rate_hertz=16000,
        language_code="en-US",
    )

    response = speech_client.recognize(config=config, audio=audio)

    for result in response.results:
        return result.alternatives[0].transcript

def translate_text(text, target_language="am"):
    result = translate_client.translate(text, target_language=target_language)
    return result["translatedText"]
