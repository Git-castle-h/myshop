let contextPath = document.querySelector("#contextPath").value;
let pwReset_btn = document.querySelector(".pwReset_btn");

pwReset_btn.addEventListener("click",function(){

    let user_id = document.querySelector(".user_id");
    let user_name = document.querySelector(".user_name");
    let user_email = document.querySelector(".user_email");

    $.ajax({
        type:'POST',
        async:false,
        url:contextPath+"/login/pwReset_email",
        data:{
            id : user_id.value,
            name :  user_name.value,
            email :  user_email.value
        },
        success:function(data){
            if(data == "succeed"){
                alert(user_email.value+"계정으로 메일이 발송되었습니다.");
            }else{
                alert("회원정보가 존재하지 않습니다.");
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