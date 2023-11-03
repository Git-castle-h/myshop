let mod_btn = document.querySelector(".mod_btn");

let main_banner = document.querySelector(".main_banner");
let sub_banner_1 = document.querySelector(".sub_banner_1");
let sub_banner_2 = document.querySelector(".sub_banner_2");

mod_btn.addEventListener("click",function(){

    let main_title = main_banner.querySelector(".ms_title");
    let main_detail = main_banner.querySelector(".ms_detail");
    let main_bgc = main_banner.querySelector(".ms_bgc");
    let main_link = main_banner.querySelector(".ms_link");
    let main_file = main_banner.querySelector(".file_input");

    let sub1_title = sub_banner_1.querySelector(".ms_title");
    let sub1_detail = sub_banner_1.querySelector(".ms_detail");
    let sub1_bgc = sub_banner_1.querySelector(".ms_bgc");
    let sub1_link = sub_banner_1.querySelector(".ms_link");
    let sub1_file = sub_banner_1.querySelector(".file_input");
    
    let sub2_title = sub_banner_2.querySelector(".ms_title");
    let sub2_detail = sub_banner_2.querySelector(".ms_detail");
    let sub2_bgc = sub_banner_2.querySelector(".ms_bgc");
    let sub2_link = sub_banner_2.querySelector(".ms_link");
    let sub2_file = sub_banner_2.querySelector(".file_input");


    $.ajax({
        type:'POST',
        async:false,
        url:contextPath+"/admin/main/main.do",
        data:{
            m_title : main_title.value,
            m_detail : main_detail.value,
            m_bg : main_bgc.value,
            m_link : main_link.value,
            m_file : main_file.value,

            s1_title : sub1_title.value,
            s1_detail : sub1_detail.value,
            s1_bg : sub1_bgc.value,
            s1_link :sub1_link.value,
            s1_file : sub1_file.value,

            s2_title : sub2_title.value,
            s2_detail : sub2_detail.value,
            s2_bg : sub2_bgc.value,
            s2_link : sub2_link.value,
            s2_file : sub2_file.value


        },
        success:function(data,textStatus){
            console.log("작업이 순조롭게 진행되었습니다.");
            if(window.confirm("배너가 수정되었습니다.")){
                location.href = contextPath+"/admin/main/main";
            }
            
        },
        error:function(data,textStatus){
            console.log("에러가 발생했습니다.");
            alert("에러 발생");
        },
        complete:function(data,textStatus){
            console.log("작업을 완료했습니다.");
        }
        
    });

});