   <div align="center">
   <div style="display: inline_block"><br>
     <img align="center" height="40" width="40" src="https://lksistemas.com.br/img/icons/Java-Light.svg">
     </div></div>
# SelectionSort-JAVA

<h1>Algoritmo de Ordenação Selection Sort em JAVA</h1>
<p>o SelectionSort a implementação torna-se mais simples ainda, porém perdemos muito com o desempenho.</p> 
<p>Este algoritmo tem por objetivo passar sempre o menor valor para a primeira posição (dependendo da ordem requerida pode ser o maior valor). </p>
<p>Então, para que isso seja feito ele percorre todos os elementos procurando um menor valor para só então colocá-lo na primeira posição, repetindo essa tarefa para cada 
um dos elementos.</p>

Nos algoritmos de ordenação as medidas de complexidade relevantes são:
<li>Número de comparações C(n) entre chaves.
<li>Número de movimentações M(n) dos registros dos vetores.
<li>Onde n é o número de registros.

A ordenação por seleção ou selection sort consiste em selecionar o menor item e colocar na primeira posição, selecionar o segundo menor item e colocar na segunda posição, segue estes passos até que reste um único elemento. Para todos os casos (melhor, médio e pior caso) possui complexidade C(n) = O(n²) e não é um algoritmo estável.
<p>Perceba que este algoritmo possui um péssimo desempenho, visto que sua complexidade é sempre exponencial, independente do caso em que estamos trabalhando. </p>
<p>Antes mesmo de mostrar qualquer código você já deve ser capaz de perceber que este algoritmo é bom para trabalhar-se comaté, pelo menos, 10.000 elementos, dada a 
tabela do InsertionSort, visto sua simplicidade na implementação.</p>
<img src="https://github.com/lucasrm1981/SelectionSort-JAVA/blob/main/SelectionSort.PNG">
<p>
   <img src="https://github.com/lucasrm1981/SelectionSort-JAVA/blob/main/selection-sort-animation-2-1.gif">
   <img src="https://github.com/lucasrm1981/SelectionSort-JAVA/blob/main/selection-sort-animation-1.gif">
   </p>
