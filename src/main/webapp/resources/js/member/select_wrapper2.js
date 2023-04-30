let select_wrapper2 = document.querySelector(".select_wrapper2");
let select_wrapper2_etc = document.querySelector(".select_wrapper2_etc");

select_wrapper2.addEventListener("click",function(e){
    toggle_btn = e.currentTarget.querySelector(".toggle_btn");
    select_box = e.currentTarget.querySelector(".select_box");
    select_btn = e.currentTarget.querySelectorAll(".select_btn");

    document.addEventListener("click",function(e){
        if(e.target.classList.contains("select")||e.target.closest(".select")){
        }else{
            if(!(select_box.classList.contains("hide"))){
                select_box.classList.add("hide");
            }
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
            toggle_btn.querySelector(".txt").innerHTML = select_btn_txt;
            select_box.classList.add("hide");

            if(select_btn_txt =="기타"){
                select_wrapper2_etc.disabled = false;
            }else{
                select_wrapper2_etc.disabled = true;
                select_wrapper2_etc.innerHTML = "";
            }
        });
    });

});

