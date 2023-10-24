const fromText = document.querySelector(".fromText");
const toText = document.querySelector(".toText");
const fromLang = document.querySelector(".fromLang");
const toLang = document.querySelector(".toLang");
const btn = document.querySelector(".btn");
const icons = document.querySelectorAll(".icons");

//en-US
//vi-VN
let fromVal = "ja-JP";
let toVal = "vi-VN";

fromLang.addEventListener("change",()=>{
    fromVal = fromLang.value;
});

toLang.addEventListener("change",()=>{
     toVal = toLang.value;
});

//https://mymemory.translated.net/doc/spec.php
btn.addEventListener("click",()=>{
    let sentence =fromText.value ;

    console.log(sentence);
    console.log(fromVal);
    console.log(toVal);
    fetch(`https://api.mymemory.translated.net/get?q=${sentence}&langpair=${fromVal}|${toVal}`
    ).then((res) => res.json())
    .then((data)=>{
        //console.log(data);
        return(toText.value = data.responseData.translatedText);
    });
});


icons.forEach((icons) => {
    icons.addEventListener("click", (data) => {
    //console.log(data);
        let voice;
        if(data.target.id === "fromAudio"){
            new SpeechSynthesisUtterance(fromText.value);
        }
        if(data.target.id === "fromCopy"){
            navigator.clipboard.writeText(fromText.value);
        }
        if(data.target.id === "toAudio"){
            voice = new SpeechSynthesisUtterance(toText.value);
        }
        if(data.target.id === "toCopy"){
            navigator.clipboard.writeText(toText.value);
        }
        if (voice) {
            speechSynthesis.speak(voice);    
        }
        
        //console.log(voice);
    });
});

document.getElementById("addFuriganaButton").addEventListener("click", function() {
    let kanjiElements = document.querySelectorAll(".kanji");
  
    kanjiElements.forEach(function(element) {
      let furigana = element.textContent;
      element.innerHTML = element.innerHTML + `<span class="furigana">${furigana}</span>`;
    });
  });
  


// var perform = function(output_type, sentence) {
//     var endpoint = "https://labs.goo.ne.jp/api/hiragana";
//     var payload = {
//       "app_id": "xxx...",
//       "sentence": sentence,
//       "output_type": output_type
//     };
//     var options = {
//       "method": "post",
//       "payload": payload
//     };
  
//     var response = UrlFetchApp.fetch(endpoint, options);
//     var response_json = JSON.parse(response.getContentText());
//     return response_json.converted;
//   };
  
//   /**
//    * Convert Japanese KANJI to HIRAGANA by goo LAB API.
//    *
//    * @param {string} input The value of cell to convert.
//    * @return The converted value that HIRAGANA.
//    * @customfunction
//    * @author Noriaki UCHIYAMA (twitter: @noriaki)
//    */
//   function HIRAGANA(input) {
//     return perform("hiragana", input);
//   }
  
//   /**
//    * Convert Japanese KANJI to KATAKANA by goo LAB API.
//    *
//    * @param {string} input The value of cell to convert.
//    * @return The converted value that KATAKANA.
//    * @customfunction
//    * @author Noriaki UCHIYAMA (twitter: @noriaki)
//    */
//   function KATAKANA(input) {
//     return perform("katakana", input);
//   }
  
//   /**
//    * Convert Japanese KANJI to HIRAGANA/KATAKANA by goo LAB API.
//    *
//    * @param {string} input The value of cell to convert.
//    * @param {boolean} output_type The flag of convert type. TRUE: HIRAGANA, FALSE: KATAKANA.
//    * @return The converted value that specified in output_type param.
//    * @customfunction
//    * @author Noriaki UCHIYAMA (twitter: @noriaki)
//    */
//   function KANA(input, output_type) {
//     output_type = output_type ? "hiragana" : "katakana";
//     return perform(output_type, input);
//   }
