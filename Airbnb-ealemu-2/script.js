
function filterByCity(targetCity, listingCityArray) {
  
  let count =[];
  for (let i=0;i<listingCityArray.length;i++){
    if(listingCityArray[i].toLowerCase()==targetCity.toLowerCase()){
      count.push(i);
    }
  }
  return count;
}
filterByCityTest()

function filterByPrice(minPrice, maxPrice, listingPriceArray) {
 
  let thePriceArray=[];
  for(let i=0;i<listingPriceArray.length;i++){
    if(listingPriceArray[i]>=minPrice && listingPriceArray[i]<=maxPrice){
      thePriceArray.push(i);
    }
  }
  return thePriceArray;
}
filterByPriceTest()

function filterByTypes(targetTypes, listingTypeArray) {
 
  let arrayType=[];
  for(let i=0;i<listingTypeArray.length;i++){
    for(let j=0;j<targetTypes.length;j++){
      if(targetTypes[j]==listingTypeArray[i]){
        arrayType.push(i);
      }
    }
  }
  return arrayType;
}
filterByTypesTest()
