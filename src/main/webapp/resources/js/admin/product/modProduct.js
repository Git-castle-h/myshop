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