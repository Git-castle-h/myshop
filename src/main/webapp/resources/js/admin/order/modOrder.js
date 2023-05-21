let mod_btn = document.querySelector(".mod_btn");

mod_btn.addEventListener("click",function(){

    let mo_number = document.querySelector(".mo_number .plusMinus_input");
    let mo_option = document.querySelector(".mo_option .select_input");
    let mo_status = document.querySelector(".mo_status .select_input");

    let mo_address =document.querySelector(".mo_address");

    let address1 = mo_address.querySelector(".mo_postnum");
    let address2 = mo_address.querySelector(".mo_address_basic");
    let address3 = mo_address.querySelector(".mo_address_detail");

    $.ajax({
        type:'POST',
        async:false,
        url:contextPath+"/admin/order/modOrder.do",
        data:{
            o_number : mo_number.value,
            o_option : mo_option.value,
            o_status : mo_status.value,
            o_address1 : address1.value,
            o_address2 : address2.value,
            o_address3 : address3.value
        },
        success:function(data,textStatus){
            console.log("작업이 순조롭게 진행되었습니다.");
            alert("주문이 수정되었습니다.");
            location.href=contextPath+"/admin/order/orderList";
        },
        error:function(data,textStatus){
            console.log("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
            console.log("작업을 완료했습니다.");
        }
        
    });

});
