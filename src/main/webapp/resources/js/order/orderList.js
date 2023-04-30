let plusMinus_wrap = document.querySelectorAll(".plusMinus_wrap");

plusMinus_wrap.forEach(function(e){
    let plus = e.querySelector(".plus");
    let minus = e.querySelector(".minus");
    let plusMinus_input = e.querySelector(".plusMinus_input");
    let pm_num = plusMinus_input.value;


    plus.addEventListener("click",function(){
        plusMinus_input = e.querySelector(".plusMinus_input");
        pm_num = plusMinus_input.value;
            plusMinus_input.value = parseInt(pm_num) + 1;
    });

    minus.addEventListener("click",function(){
        plusMinus_input = e.querySelector(".plusMinus_input");
        pm_num = plusMinus_input.value;
            plusMinus_input.value = parseInt(pm_num) - 1;
        
    });

    plusMinus_input.addEventListener("change",function(e){
        console.log(plusMinus_input.value);
        if(plusMinus_input.value>99){
            alert("99 이하의 숫자만 입력 가능합니다.");
            plusMinus_input.value = 99;
        }
        
        if(plusMinus_input.value<1){
            alert("1 이상의 숫자만 입력 가능합니다.");
            plusMinus_input.value = 1;
        }
    });


});