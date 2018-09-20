$(document).ready(function()
{
    $('#btnSubmit').prop('disabled',true);
    
    $('#CPassword').keyup(function(e)
    {
       Check();
    });
    
    
    function Check()
    {
           if($('.Password').val().length>=8)
             {
                 
               $('#pwHelp').attr('hidden',true);
               
                 
               if($('#CPassword').val() != $('.Password').val())
                   {
                          
                       
                       if($('#CPassword').val()=="")
                           {
                               $('#emailHelp').attr('hidden',true);
                           }
                       else
                       
                          {$('#emailHelp').attr('hidden',false);
                          
                          $('#ip1').attr('class','input-group-text text-danger');
                          $('.Password').attr('class','form-control border border-danger Password');
                       
                          $('#ip2').attr('class','input-group-text text-danger');
                          $('#CPassword').attr('class','form-control border border-danger');
                           
                           $('#btnSubmit').prop('disabled',true);
                   }
                   }
                 
                 else
                     {
                         $('#emailHelp').attr('hidden',true);
                         $('#btnSubmit').prop('disabled',false);
                         
                         $('#ip1').attr('class','input-group-text text-success');
                         $('.Password').attr('class','form-control border border-success Password');
                         
                           $('#ip2').attr('class','input-group-text text-success');
                         $('#CPassword').attr('class','form-control border border-success');
                     }
             }
        else
            {
               $('#pwHelp').attr('hidden',false);
            }
        
    }
    
    
    
    $('.Password').keyup(function(e)
    {
        Check();
   
      if($('.Password').val().length<8)
          {
              $('#pwHelp').attr('hidden',false);
              $('#emailHelp').attr('hidden',true);
          }
        
        else if($('.Password').val().length>=8)
            {
                   $('#pwHelp').attr('hidden',true);
            }
        
        else
            {   
                var code = e.keyCode || e.which;
                if (code == '9')
                {
                   $('#pwHelp').prop('hidden',true);
                }
               
              
            }
          
        
});
        
 
    $("#btnSubmit").click(function(event){
        
        event.preventDefault();
        
        $("#form1").submit();
        $('#subP').animate({color:"#64b6ac"},2000)  
        $("#illusion").prop('hidden',false);
        $("#illusion").animate({height:'518px'},3000);
       
     
      
  
    });
    
    $('#ip0').focusout(function()
                   {
        
       if(/^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/.test($('#ip0').val()))
           {
                $('#forEmail').attr('class','input-group-text text-success');
           }
        else
            {
                $('#forEmail').attr('class','input-group-text text-danger');
            }
        
    });
    
   
    
});