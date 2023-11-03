//option 추가 부분
    let po_essential_btn_plus = document.querySelector(".po_essential_btn.plus");
    let po_essential_btn_minus = document.querySelector(".po_essential_btn.minus");
    let po_form_context = document.querySelector(".product_option .form_context .form_line");

    po_essential_btn_plus.addEventListener("click",function(){

        let po_line = document.createElement("div");
        let po_option = document.createElement("input");
        po_line.setAttribute("class","po_line");
        po_line.appendChild(po_option);
        po_option.setAttribute("class","po_option w100");
        po_option.setAttribute("placeholder","옵션을 입력해주세요");

        po_form_context.appendChild(po_line);

        po_line_verify();
    });

    po_essential_btn_minus.addEventListener("click",function(){

        let po_line_arr = document.querySelectorAll(".po_line");
        let last = po_line_arr[po_line_arr.length - 1];
        last.remove();

        po_line_verify();
    });

    function po_line_verify(){
        let po_line_arr = document.querySelectorAll(".po_line");
        let po_essential_btn_plus = document.querySelector(".po_essential_btn.plus");
        let po_essential_btn_minus = document.querySelector(".po_essential_btn.minus");

        if(po_line_arr.length <= 1){
            po_essential_btn_minus.classList.add("disabled");
        }else{
            po_essential_btn_minus.classList.remove("disabled");
        }
    }

    po_line_verify();
//====================================

let mp_btn = document.querySelector(".mp_btn");

mp_btn.addEventListener("click",function(){
    let mp_cate = document.querySelector(".mp_cate .select_input");
    let mp_img = document.querySelector(".mp_img .file_input");
    let mp_t_img =document.querySelector(".mp_t_img .file_input");

    let mp_rec_check = document.querySelector(".mp_rec");
    let mp_rec = "";

    if(mp_rec_check.checked){
        mp_rec = "recommend";
    }else{
        mp_rec = "no";
    }

    let mp_name =document.querySelector(".mp_name");
    let mp_price =document.querySelector(".mp_price");
    let mp_d_title = document.querySelector(".pd_title");
    let mp_d_cxt = document.querySelector(".pd_context");
    // let mp_ess_check = document.querySelector(".po_essential_input");
    let mp_ess = "";

    // if(mp_ess_check.checked){
    //     mp_ess = "essential";
    // }

    let mp_option_arr = document.querySelectorAll(".po_line .po_option");
    let mp_options = [];

    mp_option_arr.forEach(function(e){
        let option = e.value;
        if(option != ""){
            mp_options.push(option);
            console.log("pushed "+option);
        }
    });
    console.log(mp_options);

    $.ajax({
        type:'POST',
        async:false,
        url:contextPath+"/admin/product/modProduct.do",
        data:{
            mp_cate : mp_cate.value,
            mp_img : mp_img.value,
            mp_t_img : mp_t_img.value,
            mp_rec : mp_rec,
            mp_name :mp_name.value,
            mp_price :mp_price.value,
            mp_d_title :mp_d_title.value,
            mp_d_cxt :mp_d_cxt.value,
            mp_ess : mp_ess,
            mp_options : mp_options

        },
        success:function(data,textStatus){
            console.log("작업이 순조롭게 진행되었습니다.");
            alert("수정되었습니다");
            location.reload();
        },
        error:function(data,textStatus){
            console.log("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
            console.log("작업을 완료했습니다.");
        }
        
    });

});



