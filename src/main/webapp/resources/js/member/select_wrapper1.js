let select_wrapper1 = document.querySelector(".select_wrapper1");

select_wrapper1.addEventListener("click",function(e){
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
        });
    });

});