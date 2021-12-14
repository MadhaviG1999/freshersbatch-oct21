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
 const getNextArmstrong = (lower, upper) => {
    return{
        next:()=>{
            const res = [];
            for(let i = lower; i <= upper; i++){
                if(isArmstrong(i)){
                res.push(i)
            };
        }
        return {value:res};
        }
    }
}
let it =getNextArmstrong(10, 400);

console.log(it.next());