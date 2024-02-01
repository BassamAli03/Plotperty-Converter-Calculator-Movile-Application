function convert() {
                      
    var value1 = parseFloat(document.getElementById('value1').value);
    var field1 = document.getElementById("field1").value;
    var field2 = document.getElementById("field2").value;
    var result1;
    var result2;

    if (value1 != "" && field1 == "option1" && field2 == "option1") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Marla  = ";
        document.getElementById("result1").textContent=result1;
        document.getElementById("demo2").innerHTML = value1;
        result2= "Marla";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option2" && field2 == "option2") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Kanal  = ";
        document.getElementById("result1").textContent=result1;
        document.getElementById("demo2").innerHTML = value1;
        result2= "Kanal";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != "" && field1 == "option3" && field2 == "option3") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Ft  = ";
        document.getElementById("result1").textContent=result1;
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Ft";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option4" && field2 == "option4") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Yards  = ";
        document.getElementById("result1").textContent=result1;
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Yards";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option5" && field2 == "option5") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Meters  = ";
        document.getElementById("result1").textContent=result1;
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Meters";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option6" && field2 == "option6") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Acre  = ";
        document.getElementById("result1").textContent=result1;
        document.getElementById("demo2").innerHTML = value1;
        result2= "Acre";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option7" && field2 == "option7") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Murabba  = ";
        document.getElementById("result1").textContent=result1;
        document.getElementById("demo2").innerHTML = value1;
        result2= "Murabba";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option1" && field2 == "option2") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Marla  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/20;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Kanal";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option1" && field2 == "option3") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Marla  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*272.3;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Ft";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""   && field1 == "option1" && field2 == "option4") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Marla  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*30.25;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Yards";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option1" && field2 == "option5") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Marla  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*25.293;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Meters";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option1" && field2 == "option6") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Marla  = ";
        document.getElementById("result1").textContent=result1;
        value1=  value1/160;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Acre";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option1" && field2 == "option7") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Marla  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/4000;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Murabba";
        document.getElementById("result2").textContent=result2;
    }



    else if (value1 != ""  && field1 == "option2" && field2 == "option1") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Kanal  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*20;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Marla";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option2" && field2 == "option3") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Kanal  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*5445;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Ft";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""   && field1 == "option2" && field2 == "option4") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Kanal  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*605;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Yards";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option2" && field2 == "option5") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Kanal  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*505.9;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Meters";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option2" && field2 == "option6") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Kanal  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/8;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Acre";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option2" && field2 == "option7") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Kanal  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/200;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Murabba";
        document.getElementById("result2").textContent=result2;
    }



    else if (value1 != ""  && field1 == "option3" && field2 == "option1") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Ft  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/272.3;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Marla";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option3" && field2 == "option2") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Ft  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/5445;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Kanal";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""   && field1 == "option3" && field2 == "option4") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Ft  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/9;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Yards";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option3" && field2 == "option5") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Ft  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/10.764;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Meters";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option3" && field2 == "option6") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.ft  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/43560;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
    
        result2= "Acre";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option3" && field2 == "option7") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.ft  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/1089000;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Murabba";
        document.getElementById("result2").textContent=result2;
    }



    else if (value1 != ""  && field1 == "option4" && field2 == "option1") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Yards  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/30.25;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Marla";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option4" && field2 == "option2") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Yards  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/605;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Kanal";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""   && field1 == "option4" && field2 == "option3") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Yards  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*9;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Ft";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option4" && field2 == "option5") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Yards  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/1.196;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Meters";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option4" && field2 == "option6") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Yards  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/4840;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Acre";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option4" && field2 == "option7") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Yards  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/120999.9882;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Murabba";
        document.getElementById("result2").textContent=result2;
    }


    else if (value1 != ""  && field1 == "option5" && field2 == "option1") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Meters  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/25.293;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Marla";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option5" && field2 == "option2") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Meters  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/505.9;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Kanal";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""   && field1 == "option5" && field2 == "option3") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Meters  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*10.764;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Ft";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option5" && field2 == "option4") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Meters  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*1.196;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Yards";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option5" && field2 == "option6") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Meters  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/4047;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Acre";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option5" && field2 == "option7") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Sq.Meters  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/101171.4106;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Murabba";
        document.getElementById("result2").textContent=result2;
    }



    else if (value1 != ""  && field1 == "option6" && field2 == "option1") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Acre  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*160;;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Marla";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option6" && field2 == "option2") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Acre  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*8;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Kanal";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""   && field1 == "option6" && field2 == "option3") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Acre  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*43560;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Ft";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option6" && field2 == "option4") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Acre  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*4840;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Yards";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option6" && field2 == "option5") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Acre  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*4047;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Meters";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option6" && field2 == "option7") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Acre  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1/25;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Murabba";
        document.getElementById("result2").textContent=result2;
    }


    else if (value1 != ""  && field1 == "option7" && field2 == "option1") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Murabba  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*4000;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Marla";
        document.getElementById("result2").textContent=result2;


    }
    else if (value1 != ""  && field1 == "option7" && field2 == "option2") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Murabba  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*200;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Kanal";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""   && field1 == "option7" && field2 == "option3") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Murabba  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*1089000;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Ft";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option7" && field2 == "option4") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Murabba  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*120999.9882;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Yards";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option7" && field2 == "option5") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Murabba  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*101171.4106;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Sq.Meters";
        document.getElementById("result2").textContent=result2;


    }else if (value1 != ""  && field1 == "option7" && field2 == "option6") {
        document.getElementById("demo1").innerHTML = value1;
        result1= "Murabba  = ";
        document.getElementById("result1").textContent=result1;
        value1= value1*25;
        value1=value1.toFixed(3);
        document.getElementById("demo2").innerHTML = value1;
        result2= "Acre";
        document.getElementById("result2").textContent=result2;
    }

    
  }