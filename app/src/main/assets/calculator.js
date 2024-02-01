function calculate(){

    var value3 = parseFloat(document.getElementById('value3').value);
    var value4 = parseFloat(document.getElementById('value4').value);
    var field4 = document.getElementById("field4").value;


    var cementcost=0;  
    var sandcost=0;
    var aggregatecost=0;
    var steelcost=0;
    var fittingscost=0;
    var finisherscost=0;
    var totalcost=0;

    if(value3 != "" && value4 != "" && field4 == "option1" ){
        totalcost= value3*value4;
       
        cementcost = (16.4/100)*totalcost;
        sandcost =(12.3/100)*totalcost; 
        aggregatecost =(7.4/100)*totalcost;
        steelcost =(24.6/100)*totalcost;

        document.getElementById("fittingscost").innerHTML = fittingscost;
        document.getElementById("finisherscost").innerHTML = finisherscost;

        totalcost = (cementcost+sandcost+aggregatecost+steelcost);
        totalcost = totalcost.toFixed(2);
        document.getElementById("demo3").innerHTML = totalcost;
        document.getElementById("totalcost").innerHTML = totalcost;

        cementcost =cementcost.toFixed(2);
        document.getElementById("cementcost").innerHTML = cementcost;
        sandcost =sandcost.toFixed(2);
        document.getElementById("sandcost").innerHTML = sandcost;
        aggregatecost =aggregatecost.toFixed(2);
        document.getElementById("aggregatecost").innerHTML = aggregatecost;
        steelcost =steelcost.toFixed(2);
        document.getElementById("steelcost").innerHTML = steelcost;

    }

    else if(value3 != "" && value4 != "" && field4 == "option2" ){
        totalcost= value3*value4;

        cementcost = (16.4/100)*totalcost;
        cementcost =cementcost.toFixed(2);
        document.getElementById("cementcost").innerHTML = cementcost;
        sandcost =(12.3/100)*totalcost;
        sandcost = sandcost.toFixed(2);
        document.getElementById("sandcost").innerHTML = sandcost;
        aggregatecost =(7.4/100)*totalcost;
        aggregatecost = aggregatecost.toFixed(2);
        document.getElementById("aggregatecost").innerHTML = aggregatecost;
        steelcost =(24.6/100)*totalcost;
        steelcost = steelcost.toFixed(2);
        document.getElementById("steelcost").innerHTML = steelcost;
        fittingscost =(22.8/100)*totalcost;
        fittingscost = fittingscost.toFixed(2);
        document.getElementById("fittingscost").innerHTML = fittingscost;
        finisherscost =(16.5/100)*totalcost;
        finisherscost = finisherscost.toFixed(2);
        document.getElementById("finisherscost").innerHTML = finisherscost;

        totalcost=totalcost.toFixed(2);
        document.getElementById("demo3").innerHTML = totalcost;
        document.getElementById("totalcost").innerHTML = totalcost;

    }
    else
    {
        alert("Some Field Empty!");
    }
}