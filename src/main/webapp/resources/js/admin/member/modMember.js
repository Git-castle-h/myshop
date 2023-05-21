let mod_btn = document.querySelector(".mod_btn");

mod_btn.addEventListener("click",function(){

    let mm_id = document.querySelector(".mm_id");
    let mm_pw = document.querySelector(".mm_pw_confirm");

    let mm_address1 = document.querySelector(".mm_postnum");
    let mm_address2 = document.querySelector(".mm_address_basic");
    let mm_address3 = document.querySelector(".mm_address_detail");

    let mm_call1 = "";

    let mm_call_1_1 = document.querySelector(".mm_call_1_1").value;
    let mm_call_1_2 = document.querySelector(".mm_call_1_2").value;
    let mm_call_1_3 = document.querySelector(".mm_call_1_3").value;

    mm_call1 = mm_call_1_1+"-"+mm_call_1_2+"-"+mm_call_1_3;

    let mm_call2 ="";

    let mm_call_2_1 = document.querySelector(".mm_call_2_1").value;
    let mm_call_2_2 = document.querySelector(".mm_call_2_2").value;
    let mm_call_2_3 = document.querySelector(".mm_call_2_3").value;

    mm_call2 = mm_call_2_1+"-"+mm_call_2_2+"-"+mm_call_2_3;

    let mm_email =document.querySelector(".mm_email");


    let mm_gender_arr = document.querySelectorAll(".mm_gender");
    let mm_gender = "";
    mm_gender_arr.forEach(function(e){
        if(e.checked){
            mm_gender = e.value;
        }
    });

    let mm_b_day = document.querySelector(".mm_b_day");
    let mm_job = document.querySelector(".mm_job .select_input");

    $.ajax({
        type:'post',
        async:false,
        url:contextPath+"/admin/member/modMember.do",
        data:{
            m_id : mm_id.value,
            m_pw : mm_pw.value,
            m_email : mm_email.value,
            
            m_address1 : mm_address1.value,
            m_address2 : mm_address2.value,
            m_address3 : mm_address3.value,

            m_tel1 : mm_call1,
            m_tel2 : mm_call2,

            m_gender : mm_gender,
            m_b_day : mm_b_day.value,
            m_job : mm_job.value
        },
        success:function(data,textStatus){
            console.log("작업이 순조롭게 진행되었습니다.");
            alert("멤버 정보 수정이 완료되었습니다.");
            location.href = contextPath+"/admin/member/memberList";

        },
        error:function(data,textStatus){
            console.log("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
            console.log("작업을 완료했습니다.");
        }
        
    });

});
