let join_btn = document.querySelector(".memberjoin_wrap .join_btn");

join_btn.addEventListener("click",function(){
    //필수
    let mj_id = document.querySelector(".mj_id").value;
    let mj_pw = document.querySelector(".mj_pw").value;
    let mj_pw_confirm = document.querySelector(".mj_pw_confirm").value;

    //필수
    let mj_postnum = document.querySelector(".mj_postnum").value;
    let mj_address_basic = document.querySelector(".mj_address_basic").value;
    let mj_address_detail = document.querySelector(".mj_address_detail").value;

    let mj_call_1_1 = document.querySelector(".mj_call_1_1").value;
    let mj_call_1_2 = document.querySelector(".mj_call_1_2").value;
    let mj_call_1_3 = document.querySelector(".mj_call_1_3").value;

    //필수
    let mj_call_1 = "";

    if(mj_call_1_1!=""&&mj_call_1_2!=""&&mj_call_1_3!=""){
        mj_call_1 = mj_call_1_1+"-"+mj_call_1_2+"-"+mj_call_1_3;
    }

    let mj_call_2_1 = document.querySelector(".mj_call_2_1").value;
    let mj_call_2_2 = document.querySelector(".mj_call_2_2").value;
    let mj_call_2_3 = document.querySelector(".mj_call_2_3").value;

    //선택
    let mj_call_2 = "";

    if(mj_call_2_1!=""&&mj_call_2_2!=""&&mj_call_2_3!=""){
        mj_call_2 = mj_call_2_1+"-"+mj_call_2_2+"-"+mj_call_2_3;
    }


    // let mj_newsletter_chx = document.querySelector(".mj_newsletter_chx");
    // let mj_newsletter = "";

    //필수
    let mj_email = document.querySelector(".mj_email").value;

    let mj_gender_arr = document.querySelectorAll(".mj_gender");
    let mj_gender = "";
    mj_gender_arr.forEach(function(e){
        if(e.checked){
            mj_gender = "e.value";
        }
    });
    
    let mj_b_day = document.querySelector(".mj_b_day").value;
    let mj_job = document.querySelector(".mj_job .select_input").value;

    //선택
    let mj_recommend = document.querySelector(".mj_recommend").value;

    //필수
    let agree_chx = document.querySelector("#agree_chx");
    let agree1 = "";
    if(agree_chx.checked){
        agree1 ="agreed";
    }

    //필수
    let privacy_chx = document.querySelector("#privacy_chx");
    let agree2 = "";
    if(privacy_chx.checked){
        agree2 ="agreed";
    }

    //선택
    let personalinfo_chx = document.querySelector("#personalinfo_chx");
    let agree3 = "";
    if(personalinfo_chx.checked){
        agree3 ="agreed";
    }else{
        agree3 ="no";
    }

    if(
        mj_pw !=
        mj_pw_confirm
    ){
        alert("비밀번호 확인이 일치하지 않습니다.");
        return;
    }

    if(
        mj_id !=""&&
        mj_pw !=""&&
        mj_pw_confirm !=""&&
        mj_postnum!=""&&
        mj_address_basic!=""&&
        mj_address_detail!=""&&
        mj_call_1!=""&&
        mj_email!=""&&
        mj_gender!=""&&
        mj_b_day!=""&&
        mj_job!=""&&
        agree1!=""&&
        agree2!=""
    ){

        $.ajax({
            type:'POST',
            dataType:'text',
            async:false,
            url:contextPath+"/member/memberJoin.do",
            data:{
                m_id:mj_id,
                m_email:mj_email,
                m_password: mj_pw_confirm,
                m_address1: mj_postnum,
                m_address2: mj_address_basic,
                m_address3: mj_address_detail,
                m_tel1 : mj_call_1,
                m_tel2 : mj_call_2,
                m_gender : mj_gender,
                m_b_day :mj_b_day,
                m_job : mj_job,
                m_recommend : mj_recommend,
                m_agree1 : agree1,
                m_agree2 : agree2,
                m_agree3 : agree3

            },
            success:function(data,textStatus){
                console.log("작업이 순조롭게 진행되었습니다.");
            },
            error:function(data,textStatus){
                console.log("에러가 발생했습니다.");
            },
            complete:function(data,textStatus){
                console.log("작업을 완료했습니다.");
            }
            
        }); 


    }else{
        alert("작성되지 않은 필수 항목이 있습니다.");

        console.log(mj_id);
        console.log(mj_pw);
        console.log(mj_pw_confirm);
        console.log(mj_postnum);
        console.log(mj_address_basic);
        console.log(mj_address_detail);
        console.log(mj_call_1);
        console.log(mj_email);
        console.log(mj_gender);
        console.log(mj_b_day);
        console.log(mj_job);
        console.log(agree1);
        console.log(agree2);

        return;
    }

})