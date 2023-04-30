let select_wrapper = document.querySelector(".select_wrapper1");
let toggle_btn = select_wrapper.querySelector(".toggle_btn");
let select_box = select_wrapper.querySelector(".select_box");
let select_btn = select_wrapper.querySelectorAll(".select_btn");
let product_name= document.querySelector(".tag_box .name").innerHTML;
let plusMinus_wrap = document.querySelectorAll(".plusMinus_wrap");


document.addEventListener("click",function(e){
    if(e.target.classList.contains("select_wrapper1")||e.target.closest(".select_wrapper1")){
        console.log(e.target);
    }else{
        if(!(select_box.classList.contains("hide"))){
            select_box.classList.add("hide");
        }
        console.log(e.target);
    }

});

toggle_btn.addEventListener("click",function(){
    if(select_box.classList.contains("hide")){
        select_box.classList.remove("hide");
    }else{
        select_box.classList.add("hide");
    }
});

select_btn.forEach(function(e){
    e.addEventListener("click",function(){
        let select_btn_txt = e.querySelector(".txt").innerHTML;
        let item_name = product_name;
        let item_option = select_btn_txt;
        console.log(select_btn_txt);
        toggle_btn.querySelector(".txt").innerHTML = select_btn_txt;
        select_box.classList.add("hide");
    });
})

plusMinus_wrap.forEach(function(e){
    let plus = e.querySelector(".plus");
    let minus = e.querySelector(".minus");
    let plusMinus_input = e.querySelector(".plusMinus_input");
    let pm_num = plusMinus_input.value;


    plus.addEventListener("click",function(){
        plusMinus_input = e.querySelector(".plusMinus_input");
        pm_num = plusMinus_input.value;
        if(pm_num<99){
            plusMinus_input.value = parseInt(pm_num) + 1;
        }else{
            alert("99 이하의 숫자만 입력 가능합니다.");
        }
    })
    minus.addEventListener("click",function(){
        plusMinus_input = e.querySelector(".plusMinus_input");
        pm_num = plusMinus_input.value;
        if(pm_num>1){
            plusMinus_input.value = parseInt(pm_num) - 1;
        }else{
            alert("1 이상의 숫자만 입력 가능합니다.");
        }
        
    })
});