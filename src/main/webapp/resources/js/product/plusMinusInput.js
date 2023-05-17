let plusMinus_wrap = document.querySelectorAll(".plusMinus_wrap");

plusMinus_wrap.forEach(function(e){
    let plus = e.querySelector(".plus");
    let minus = e.querySelector(".minus");
    let plusMinus_input = e.querySelector(".plusMinus_input");
    let pm_num = plusMinus_input.value;


    plus.addEventListener("click",function(){
        pm_num = plusMinus_input.value;
        if(pm_num<99){
            plusMinus_input.value = parseInt(pm_num) + 1;

        }else{
            alert("99 이하의 숫자만 입력 가능합니다.");
            plusMinus_input.value = 99;
        }
    })
    minus.addEventListener("click",function(){
        pm_num = plusMinus_input.value;
        if(pm_num>1){
            plusMinus_input.value = parseInt(pm_num) - 1;
        }else{
            alert("1 이상의 숫자만 입력 가능합니다.");
            plusMinus_input.value = 1;
        }
        
    })
    plusMinus_input.addEventListener("change",function(){
        pm_num = plusMinus_input.value;

        console.log("changed : "+pm_num);
        if(pm_num <1){
            alert("1 이상의 숫자만 입력 가능합니다.");
            plusMinus_input.value = 1;
        }else if(pm_num>99){
            alert("99 이하의 숫자만 입력 가능합니다.");
            plusMinus_input.value = 99;
        }
    })
});