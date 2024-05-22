from flask import Blueprint, render_template, request, jsonify
from .utils import transcribe_audio, translate_text

main = Blueprint('main', __name__)

@main.route('/')
def index():
    return render_template('index.html')

@main.route('/translate', methods=['POST'])
def translate():
    # For demonstration, we will just take the text from the request
    original_text = request.json.get('text')
    translated_text = translate_text(original_text)
    return jsonify({'original': original_text, 'translated': translated_text})
