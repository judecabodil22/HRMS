$(document).ready(function()
{
    $('#btnResetPW').prop('disabled',true);
    
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
                       
                          {
                              $('#emailHelp').attr('hidden',false);
                          
                        
                          //$('.Password').attr('class','form-control border border-danger Password');
                       
                      
                          $('#CPassword').attr('class','form-control border border-danger');
                           
                          $('#btnResetPW').prop('disabled',true);
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
    
    $("#forModal1").click(function()
                         {
        $("#forgotModal1").modal('hide');
    });
    
     $("#forModal0").click(function()
                         {
        $("#forgotModal0").modal('hide');
    });
    
});