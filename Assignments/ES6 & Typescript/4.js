let names=['Tom','Ivan','Jerry'];
let names1=names.map(item=>{
    return{ 
        name:item,
        length:item.length
    }
});
console.log(names1);