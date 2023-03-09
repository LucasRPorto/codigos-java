function saudar(pessoa, data){
    console.log(`Olá ${pessoa} hoje é dia ${data.toDateString()}`);
}

var data = new Date;
var nome = "Lucas Porto";
saudar(nome, data);