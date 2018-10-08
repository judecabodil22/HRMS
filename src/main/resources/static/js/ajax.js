$(document).ready(function()
{
       $("#btnSubmit").click(function(event){
        
        event.preventDefault();
        
        //$("#form1").submit();
        $('#subP').animate({color:"#64b6ac"},5000)  
        $("#illusion").prop('hidden',false);
       
       
      
        var data =
            {
            username:$("#ip0").val(),
            password:$('#kath').val()
            };
           
      $.ajax({
          type:"POST",
          url:"/register",
          data:JSON.stringify(data),
          contentType:"application/json",
          success:function()
          {
             $("#illusion").animate({height:'518px'},5000);
             
             var count = 5;
             
             setInterval(function()
            {
              count--;
              if(count!=0)
              {$("#countDown").html(count);}
              else
              {window.location.replace("/login");}
            },1000);
             
             $("#alert-Issuccess").slideDown(1000);
          },
          error : function(e) {
				console.log("ERROR: ", e);
				
			}
      });
  
    });
})