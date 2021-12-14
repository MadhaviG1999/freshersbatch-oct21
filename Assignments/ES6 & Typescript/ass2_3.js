const isArmstrong = number => {
    let num = number;
    const len = String(num).split("").length;
    let res = 0;
    while(num){
       const last = num % 10;
       res += Math.pow(last, len);
       num = Math.floor(num / 10);
    };
    return res === number;
 };
function* getNextArmstrong (){
    let i=0;
    let res =0
    while(true){
        let reset = yield res;
        try {
            for(let i=0; i <= 1000; i++){
                if(isArmstrong(i)){
                    yield i; 
 }              
            }  
        }catch (error) {
            console.log("Error cought");
        } 
    }
}
let it =getNextArmstrong();
console.log(it.next());
it.throw(new Error('Something went wrong'));