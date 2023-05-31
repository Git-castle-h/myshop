let mod_btn_array = document.querySelectorAll(".mod_btn");
let modal_wrap = document.querySelector(".modal_wrap");
let modal_cancel = modal_wrap.querySelector(".submit .btn.cancel");


// mod_btn_array.forEach(function(e){
//     e.addEventListener("click",function(){
//         modal_wrap.classList.add("on");
//     })
// })

modal_cancel.addEventListener("click",function(){
    modal_wrap.classList.remove("on");
})

modal_wrap.addEventListener("click",function(e){
    let target = e.target;

    if(target == modal_wrap){
        modal_cancel.click();
    }
})