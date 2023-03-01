   <div align="center">
   <div style="display: inline_block"><br>
     <img align="center" height="40" width="40" src="https://lksistemas.com.br/img/icons/Java-Light.svg">
     </div></div>
# SelectionSort-JAVA

<h1>Algoritmo de Ordenação Selection Sort em JAVA</h1>
<p>No InsertionSort vimos uma ordenação simples, já no SelectionSort a implementação torna-se mais simples ainda, porém perdemos muito com o desempenho.</p> 
<p>Este algoritmo tem por objetivo passar sempre o menor valor para a primeira posição (dependendo da ordem requerida pode ser o maior valor). </p>
<p>Então, para que isso seja feito ele percorre todos os elementos procurando um menor valor para só então colocá-lo na primeira posição, repetindo essa tarefa para cada 
um dos elementos.</p>

<li>Complexidade Pior Caso: O(n²)</li>
<li>Complexidade Caso Médio: O(n²)</li>
<li>Complexidade Melhor Caso: O(n²)</li>
<p>Perceba que este algoritmo possui um péssimo desempenho, visto que sua complexidade é sempre exponencial, independente do caso em que estamos trabalhando. </p>
<p>Antes mesmo de mostrar qualquer código você já deve ser capaz de perceber que este algoritmo é bom para trabalhar-se comaté, pelo menos, 10.000 elementos, dada a 
tabela do InsertionSort, visto sua simplicidade na implementação.</p>
<img src="https://github.com/lucasrm1981/SelectionSort-JAVA/blob/main/SelectionSort.PNG">
