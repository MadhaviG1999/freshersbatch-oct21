function sampleTable()
{
rows = window.prompt("Input number of rows");
cols = window.prompt("Input number of columns");
 for(var r=0;r<parseInt(rows,10);r++)
  {
   var x=document.getElementById('sampleTable').insertRow(r);
   for(var c=0;c<parseInt(cols,10);c++)  
    {
     var y=  x.insertCell(c);
     y.innerHTML="Row-"+r+" Col-"+c; 
    }
   }
}
sampleTable( );