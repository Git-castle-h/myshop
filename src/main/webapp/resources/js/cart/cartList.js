let order_sum = document.querySelector(".order_sum");
let product_sum = document.querySelector(".product_sum .bottom");
let shipping_sum = document.querySelector(".shipping_sum .bottom");
let price_discount = document.querySelector(".price_discount .bottom");
let final_sum = document.querySelector(".final_sum .bottom");

let cart_check_all = document.querySelector(".cart_check_all");

let cart_line_arr = document.querySelectorAll(".cart_line");

// 장바구니 각 항목 가격을 모두 더해 product_sum에 설정
function price_set(){

    cart_line_arr.forEach(function(e){
        let cart_line_select = e.querySelector(".cart_line_select");

        //항목이 선택되었을 경우에만 가격을 더하도록 if문 생성
        if(cart_line_select.checked){
            let p_sum = product_sum.innerHTML;
            let price = e.querySelector(".price_box .price").innerHTML;
            
            product_sum.innerHTML = parseInt(p_sum) + parseInt(price);

        }else{

            let p_sum = product_sum.innerHTML;
            let price = e.querySelector(".price_box .price").innerHTML;

            product_sum.innerHTML = parseInt(p_sum) - parseInt(price);

        }
        
    });
}

price_set();

// product_sum + shipping_sum - discount 값을 final_sum에 할당함
function final_price(){
    let p_sum = product_sum.innerHTML;
    let shipping = shipping_sum.innerHTML;
    let discount = price_discount.innerHTML;
    
    if(parseInt(p_sum) == 0){
        final_sum.innerHTML = 0;
    }else{
        final_sum.innerHTML = parseInt(p_sum)+parseInt(shipping)-parseInt(discount);
    }
}

final_price();



cart_line_arr.forEach(function(e){

    let cart_line_select = e.querySelector(".cart_line_select");
    // 각 cart_line의 input의 check여부 감지
    cart_line_select.addEventListener("change",function(){

        price_set();
        final_price();
    })


});

// 모두선택 check시 처리할 기능
cart_check_all.addEventListener("click",function(e){
        cart_line_arr.forEach(function(i){
            let cart_line_select = i.querySelector(".cart_line_select");
            if(!(cart_line_select.checked == cart_check_all.checked)){
                cart_line_select.click();
            }
        });

});




cart_line_arr.forEach(function(e){

    let mod_btn = e.querySelector(".mod_btn");
    let c_id = e.getAttribute("data-id");
    let modal_wrap = document.querySelector(".modal_wrap");

    let p_name = modal_wrap.querySelector(".context_box .name");
    let p_price = modal_wrap.querySelector(".context_box .price");


    // modal_select 동적 추가 변수선언
    let c_number  = modal_wrap.querySelector(".num_box .plusMinus_input");
    let select_box = modal_wrap.querySelector(".select_box");
    let toggle_btn  = modal_wrap.querySelector(".toggle_btn .txt");
    let select_input = modal_wrap.querySelector(".select_input");

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
            url:contextPath+"/cart/cartDetail.do",
            data:{
                c_id:c_id
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
                modal_wrap.classList.add("on");
            },
            error:function(data,textStatus){
                alert("에러가 발생했습니다.");
            },
            complete:function(data,textStatus){
            }
            
        });

    });

    //장바구니 수정기능
    let modify = modal_wrap.querySelector(".modify");

    modify.addEventListener("click",function(i){
        
        console.log(c_id);
        console.log(c_number.value);
        console.log(toggle_btn.innerHTML);

        $.ajax({
            type:'POST',
            async:false,
            url:contextPath+"/cart/modCart.do",
            data:{
                c_id:c_id,
                c_number:c_number.value,
                p_option:toggle_btn.innerHTML
            },
            success:function(data,textStatus){
                alert("장바구니 수정이 완료되었습니다.");
                location.href= contextPath+"/cart/cartList";
            },
            error:function(data,textStatus){
                console.log("에러가 발생했습니다.");
            },
            complete:function(data,textStatus){
                console.log("작업을 완료했습니다.");
            }
            
        });

    })

 
    // cart_line 에 포함된 삭제버튼(X) 클릭시 항목 개별 삭제기능
    let delete_btn = e.querySelector(".delete_btn");
    delete_btn.addEventListener("click",function(i){

        $.ajax({
            type:'get',
            async:false,
            url:contextPath+"/cart/cartDelete.do",
            data:{
                c_id : c_id
            },
            success:function(data,textStatus){
                alert(c_id+"번 항목이 제거되었습니다.");
                location.href= contextPath+"/cart/cartList";
            },
            error:function(data,textStatus){
                console.log("에러가 발생했습니다.");
            },
            complete:function(data,textStatus){
                console.log("작업을 완료했습니다.");
            }
            
        });

    })

});


let cart_del_btn = document.querySelector(".cart_del_btn");
//check된 cart_line 삭제 기능
cart_del_btn.addEventListener("click",function(){

    let c_id_arr = [];

    cart_line_arr.forEach(function(e){

        let c_id = e.getAttribute("data-id");
        let cart_line_select = e.querySelector(".cart_line_select");

        if(cart_line_select.checked){
            console.log(cart_line_select.checked);
            c_id_arr.push(c_id);
        }
    });

    if(c_id_arr.length == 0){

        alert("선택된 항목이 없습니다.");

    }else{
        $.ajax({
            type:'POST',
            async:false,
            url:contextPath+"/cart/cartDeleteSel.do",
            data:{
                c_id_arr:c_id_arr
            },
            success:function(data,textStatus){
                alert(c_id_arr+"선택된 항목이 제거되었습니다.");
                location.href= contextPath+"/cart/cartList";
            },
            error:function(data,textStatus){
                console.log(c_id_arr);
                alert("에러가 발생했습니다.");
            },
            complete:function(data,textStatus){
                console.log("작업을 완료했습니다.");
            }
            
        });
    }

   

});


//주문버튼 클릭시 주문페이지로 넘어가는 기능
let order_btn = document.querySelector(".order_btn");

order_btn.addEventListener("click",function(i){

    let c_id_arr = [];

    cart_line_arr.forEach(function(e){

        let c_id = e.getAttribute("data-id");
        c_id_arr.push(c_id);
    });

    $.ajax({
        type:'POST',
        async:false,
        url:contextPath+"/cart/cartToOrder.do",
        data:{
            c_id_arr:c_id_arr
        },
        success:function(data,textStatus){
            alert(c_id_arr+"주문테이블에 추가되었습니다.");
            location.href= contextPath+"/order/orderList";
        },
        error:function(data,textStatus){
            console.log(c_id_arr);
            console.log("에러가 발생했습니다.");
        },
        complete:function(data,textStatus){
            console.log("작업을 완료했습니다.");
        }
        
    });

});



