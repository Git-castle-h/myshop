let memberHelp_wrap = document.querySelector(".memberHelp_wrap");
let mh_title = memberHelp_wrap.querySelector(".mh_title");
let mh_select = memberHelp_wrap.querySelector(".mh_select");
let mh_product= memberHelp_wrap.querySelector(".mh_product");
let mh_context = memberHelp_wrap.querySelector(".mh_context");
let mh_file_name = memberHelp_wrap.querySelector(".mh_file_name");

let mh_submit = memberHelp_wrap.querySelector(".mh_submit");

mh_submit.addEventListener("click",function(){

    $.ajax({
        type:'POST',
        dataType:'text',
        url:contextPath+"/help/help.do",
        data:{
            h_title : mh_title.value,
            h_category : mh_select.value,
            h_product_name : mh_product.value,
            h_context : mh_context.value,
            h_file_name : mh_file_name.value
        },
        success:function(data,textStatus){
            alert("문의가 등록되었습니다.");
        },
        error:function(data,textStatus){
            console.log("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
            console.log("작업을 완료했습니다.");
        }
        
    });

});