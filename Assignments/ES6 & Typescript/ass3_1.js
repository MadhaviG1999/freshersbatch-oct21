const p1 = new Promise((resolve, reject) => {
    setTimeout(() => {
        let x = 10;
        console.log('Value of x is: '+x);
        resolve(x);
    }, 1 * 1000);

});
const p2 = new Promise((resolve, reject) => {
    setTimeout(() => {
        let y = 12;
        console.log('Value of y is: '+y);
        resolve(y);
    }, 2 * 1000);
});

Promise.all([p1, p2])
    .then(results => {
        const total = results.reduce((p, c) => p + c);

        console.log(`Results: ${results}`);
        console.log(`Total: ${total}`);
    });