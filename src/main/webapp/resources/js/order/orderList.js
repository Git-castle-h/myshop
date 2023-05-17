let order_line_arr = document.querySelectorAll(".order_line");

// modal.js에서 선언됨
// let modal_wrap = document.querySelector(".modal_wrap");

let c_number  = modal_wrap.querySelector(".num_box .plusMinus_input");
let select_box = modal_wrap.querySelector(".select_box");
let toggle_btn  = modal_wrap.querySelector(".toggle_btn .txt");
let select_input = modal_wrap.querySelector(".select_input");
let p_name = modal_wrap.querySelector(".context_box .name");
let p_price = modal_wrap.querySelector(".context_box .price");
let modify_btn = modal_wrap.querySelector(".modify");

let o_address_post = modal_wrap.querySelector(".postnum");
let o_address_basic = modal_wrap.querySelector(".address_basic");
let o_address_detail = modal_wrap.querySelector(".address_detail");

order_line_arr.forEach(function(e){

    let mod_btn = e.querySelector(".mod_btn");
    let o_id = e.getAttribute("data-id");
   

      // modal_select 동적 추가 변수선언
     
  
      let select_disabled_li = document.createElement("li");
      let select_disabled_btn = document.createElement("button");
          select_disabled_btn.setAttribute("class","option select_btn disabled");
      let select_disabled_span = document.createElement("span");
          select_disabled_span.innerHTML="SELECT";
          
          select_disabled_btn.appendChild(select_disabled_span);
          select_disabled_li.appendChild(select_disabled_btn);
      // modal_select 동적 추가 변수선언 === end


    mod_btn.addEventListener("click",function(){

        $.ajax({
            type:'POST',
            async:false,
            url:contextPath+"/order/orderDetail.do",
            data:{
                o_id:o_id
            },
            success:function(data,textStatus){
                let optionArr = data.options.slice(1,data.options.length-1).split(",");

                p_name.innerHTML = data.p_name;
                p_price.innerHTML = data.p_price;
                c_number.value = data.c_number;
                

                // modal_select 동적 추가 
                select_box.innerHTML = "";
                select_box.appendChild(select_disabled_li);

                toggle_btn.innerHTML = data.p_option;
                select_input.value = data.p_option;

                o_address_post.value = data.o_address_post;
                o_address_basic.value = data.o_address_basic;
                o_address_detail.value =data.o_address_detail;

                optionArr.forEach(function(e){
                    
                    let li = document.createElement("li");
                    let btn = document.createElement("button");
                        btn.setAttribute("class","option select_btn");
                        btn.setAttribute("data-value",e);
                    let span = document.createElement("span");
                        span.setAttribute("class","txt");
                        span.innerHTML = e;

                    btn.appendChild(span);
                    li.appendChild(btn);

                    select_box.appendChild(li);

                });
                // modal_select 동적 추가 end

            },
            error:function(data,textStatus){
                console.log("에러가 발생했습니다.");
            },
            complete:function(data,textStatus){
            }
            
        });

    });
    

});

//주문 수정기능

modify_btn.addEventListener("click",function(){

    let mod_option = toggle_btn.innerHTML;
    let mod_number = c_number.value;
    let mod_address_post = o_address_post.value;
    let mod_address_basic= o_address_basic.value;
    let mod_address_detail = o_address_detail.value;

    $.ajax({
        type:'get',
        async:false,
        url:contextPath+"/order/modOrder.do",
        data:{
            p_option: mod_option,
            o_number: mod_number,
            o_address1 : mod_address_post,
            o_address2 : mod_address_basic,
            o_address3 : mod_address_detail
        },
        success:function(data,textStatus){
            alert("주문이 수정되었습니다.");
            location.href= contextPath+"/order/orderList";
        },
        error:function(data,textStatus){
            console.log("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
            console.log("작업을 완료했습니다.");
        }
        
    });

});


// 주문 삭제

order_line_arr.forEach(function(e){

    let delete_btn = e.querySelector(".delete_btn");
    let o_id = e.getAttribute("data-id");

    delete_btn.addEventListener("click",function(i){

        $.ajax({
            type:'get',
            async:false,
            url:contextPath+"/order/orderDelete.do",
            data:{
                o_id : o_id
            },
            success:function(data,textStatus){
                alert(o_id+" 항목이 삭제되었습니다.");
            },
            error:function(data,textStatus){
                console.log("에러가 발생했습니다.");
            },
            complete:function(data,textStatus){
                console.log("작업을 완료했습니다.");
            }
            
        });

    })

})

