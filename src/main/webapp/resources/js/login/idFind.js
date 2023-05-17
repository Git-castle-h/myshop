let contextPath = document.querySelector("#contextPath").value;

let select_idFind = document.querySelector(".select_idFind");
let emailFind = document.querySelector(".emailFind");
let phoneFind = document.querySelector(".phoneFind");

select_idFind.addEventListener("click",function(e){
    let select_input = e.currentTarget.querySelector(".select_input");

    console.log(e.currentTarget);
    console.log(select_input.value);

    if(select_input.value =="email"){
        emailFind.style.display="block";
        phoneFind.style.display="none";
    }else if(select_input.value =="phone"){
        emailFind.style.display="none";
        phoneFind.style.display="block";
    }
});

let idFind_email = document.querySelector(".idFind_btn.email");
let id_email_verify = document.querySelector(".id_email_verify");

idFind_email.addEventListener("click",function(){
    let _user_name_email = document.querySelector("#user_name_email");
    let _user_email = document.querySelector("#user_email");
    let _user_verify_email = document.querySelector("#user_verify_email");

    console.log("idFind_email clicked");
    $.ajax({
        type:'POST',
        async:false,
        url:contextPath+"/login/idFind_email",
        data:{
            user_name_email : _user_name_email.value,
            user_email : _user_email.value
        },
        success:function(data,textStatus){
            alert(data+" 메일 계정으로 비밀번호 변경 메일이 전송되었습니다.");
            _user_verify_email.setAttribute("type","text");

            id_email_verify.style.display="block";
            idFind_email.style.display="none";

            _user_name_email.setAttribute("disabled","true");
            _user_email.setAttribute("disabled","true");
            console.log("작업이 순조롭게 진행되었습니다.");
        },
        error:function(data,textStatus){
            alert("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
            console.log("작업을 완료했습니다.");
        }
        
    });    
});


id_email_verify.addEventListener("click",function(){

    let user_verify_email = document.querySelector("#user_verify_email");

    $.ajax({
        type:'POST',
        async:false,
        url:contextPath+"/login/idFind_email_verify",
        data:{
            code : user_verify_email.value,
        },
        success:function(data){
            if(data.valid == "true"){
                alert("인증 확인되었습니다. 회원님의 아이디는 "+data.id+"입니다.");
            }else{
                alert("잘못된 인증번호 입니다.");
            }
            console.log("작업이 순조롭게 진행되었습니다.");
        },
        error:function(data,textStatus){
            alert("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
            console.log("작업을 완료했습니다.");
        }
        
    });  

});



let idFind_phone = document.querySelector(".idFind_btn.phone");
let id_phone_verify = document.querySelector(".id_phone_verify");


idFind_phone.addEventListener("click",function(){
    let _user_name_phone = document.querySelector("#user_name_phone");
    let _user_phone = document.querySelector("#user_phone");
    let _user_verify_phone = document.querySelector("#user_verify_phone");

    console.log("idFind_phone clicked");
    $.ajax({
        type:'POST',
        async:false,
        url:contextPath+"/login/idFind_phone",
        data:{
            user_name_phone : _user_name_phone.value,
            user_phone : _user_phone.value
        },
        success:function(data,textStatus){
            alert(data+" 번호로 확인 문자가 전송되었습니다.");
            _user_verify_phone.setAttribute("type","text");

            id_phone_verify.style.display="block";
            idFind_phone.style.display="none";

            _user_name_phone.setAttribute("disabled","true");
            _user_phone.setAttribute("disabled","true")
            console.log("작업이 순조롭게 진행되었습니다.");
        },
        error:function(data,textStatus){
            alert("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
;
            console.log("작업을 완료했습니다.");
        }
        
    });    
});



id_phone_verify.addEventListener("click",function(){

    let user_verify_phone = document.querySelector("#user_verify_phone");

    $.ajax({
        type:'POST',
        async:false,
        url:contextPath+"/login/idFind_phone_verify",
        data:{
            code : user_verify_phone.value,
        },
        success:function(data){
            if(data.valid == "true"){
                alert("인증 확인되었습니다. 회원님의 아이디는 "+data.id+"입니다.");
            }else{
                alert("잘못된 인증번호 입니다.");
            }
            console.log("작업이 순조롭게 진행되었습니다.");
        },
        error:function(data,textStatus){
            alert("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
            console.log("작업을 완료했습니다.");
        }
        
    });  

});

