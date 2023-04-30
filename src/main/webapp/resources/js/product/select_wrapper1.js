let select_wrapper = document.querySelector(".select_wrapper1");
let toggle_btn = select_wrapper.querySelector(".toggle_btn");
let select_box = select_wrapper.querySelector(".select_box");
let select_btn = select_wrapper.querySelectorAll(".select_btn");

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
        console.log(select_btn_txt);
        toggle_btn.querySelector(".txt").innerHTML = select_btn_txt;
        select_box.classList.add("hide");
    });
})