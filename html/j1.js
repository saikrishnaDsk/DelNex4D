function myFun(){
    var name= document.getElementById('un').value;
    var pass=document.getElementById('pass').value;
    var contact=document.getElementById('contact').value;
    
    
    
    if(name.length<5)
    {	
    
            alert('invalid name');
            return false;   
    }
    
    
    
    if(pass.length<5)
    {	
    
            alert('invalid pass');
            return false;   
    }
    if(contact.length!=10)
    {	
    
            alert('invalid contact number');
            return false;   
    }
    
    for(i=0;i<name.length; i++){
        if(!(name.charAt(i).toUpperCase() >='A' && name.charAt(i).toUpperCase() <='Z')){
            alert('invalid name');
            return false;
    
        }
    
    }
    
    var patt1 = new RegExp(/[a-zA-Z]/g);
    
    if(!patt1.test(pass)){
        alert("No letter in pass");
        return false;
    }
    
    var patt = new RegExp(/[A-Z]/g);
    
    if(!patt.test(pass)){
        alert("No Capital letter in pass");
        return false;
    }
    
    var patt2 = new RegExp(/[0-9]/g);
    
    if(!patt2.test(pass)){
        alert("No digit in pass");
        return false;
    }
    var patt3 = new RegExp(/[^0-9]/g);
    
    if(patt3.test(contact)){
        alert("Invalid Character in Contact");
        return false;
    }
    
    
    
    return true;
    }