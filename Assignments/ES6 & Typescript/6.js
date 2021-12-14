const laptop_model="Dell";
const desk_no=123;
const name="queany";
const ticket_no=Math.floor((Math.random()*100)+1);
const reported_on=new Date().toLocaleString();
console.log("ticketing tool");
let desc="Cannot log into the system,says it is locked";
console.log(`ticket_no:${ticket_no}\n 
priority:medium\n
status:open\n
reported_on:${reported_on}\n
name:${name}\n
laptop_model:${laptop_model}\n
desk_no:${desk_no}\n
desc:${desc}`);

