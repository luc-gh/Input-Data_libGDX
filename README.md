<h1>Input-Data_libGDX</h1>
<p>Este repositório possui arquivos que apresentam algumas funções usadas pelo framework libGDX, com Java, para entrada de dados e comandos
determinados pelo usuário.</p>
<h2></h2>
<h3>Tabela de commits</h3>
<div>
  <table align="center">
    <thead><th colspan="2">Modificações no arquivo <code>Input_Data.java</code> por commit</th></thead>
    <tr>
      <td>
        <a href="https://github.com/luc-gh/Input-Data_libGDX/blob/9dda6ca8139f4c571bac3a8bb091fe12bad67162/core/src/com/libgdx/input/Input_Data.java">
        <b>Commit 1 — Movimento de um círculo</b></a>
      </td>
      <td>Código que usa algumas funções de entrada (teclado/clicks/toques) para mover círculo.</td>
    </tr>
    <tr>
      <td>
        <a href="https://github.com/luc-gh/Input-Data_libGDX/blob/main/core/src/com/libgdx/input/Input_Data.java">
        <b>Commit 2 — Plano de fundo</b></a>
      </td>
      <td>Código que usa outras funções de entrada (clicks/toques) para mudar a cor do plano de fundo.</td>
    </tr>
  </table>
</div>
<div>
  <h3>Lógica do projeto</h3>
  <ul>
    <li>
      A entrada de dados de usuário é feita utilizando uma API de libGDX capaz de generalizar os dados obtidos em diferentes plataformas num formato 
      único, a fim de controlar tais processos em todas as plataformas necessárias de uma só vez. Desse modo, a maneira mais simples de obter os valores
      de entrada do usuário é pesquisar o <i>estado atual</i>.
    </li>
    <li>
      Esse processo é chamado de <i>Sondagem (Polling)</i>, cujas principais funções úteis são (para utilizar conforme a demanda em cada classe):
      <ul>
        <li>
          <code>Gdx.input.isTouched()</code>, que retorna true ou false dependendo se o usuário está clicando com o mouse ou tocando na tela. 
          Isso funciona em dispositivos em telas sensíveis ao toque e interfaces de mouse.
        </li>
        <li>
          <code>Gdx.input.getX()</code>, que retorna o valor da coordenada X do toque ou clique.
        </li>
        <li>
          <code>Gdx.input.getY()</code>, que retorna o valor da coordenada Y do toque ou clique.<br>
          <i>OBS:</i>
          como o OpenGL renderiza com Y começando na parte inferior em vez da parte superior, deve-se mudar os valores das coordenadas de toque para 
          coordenadas de renderização subtraindo o valor da altura: <kbd>Gdx.graphics.getHeight() - Gdx.input.getY()</kbd>. 
          Isso fornece a coordenada de renderização tocada corretamente.
        </li>
        <li>
          <code>Gdx.input.isKeyPressed()</code>, que retorna <kbd>true</kbd> se uma determinada tecla for pressionada no momento.<br>
          Esta função recebe um argumento <code>int key</code>, da classe <code>Input.Keys</code>.<br>
          Por exemplo, o comando <code>Gdx.input.isKeyPressed(Input.Keys.W)</code> 
          verificase a tecla W está pressionada no momento.<br>
          Esta função só faz sentido em dispositivos que possuem teclado físico.
        </li>
      </ul>
    </li>
    <li>
      O <b>primeiro commit</b> da código principal utiliza as algumas destas funções de entrada para detectar clicks/toques na tela, porém não todas. <br>
      Existem muito mais funções de entrada úteis, incluindo funções que permitem obter dados de rotação do telefone e 
      funções que permitem rastrear vários toques simultâneos.<br>
      Leia a <a href="https://libgdx.badlogicgames.com/ci/nightlies/docs/api/com/badlogic/gdx/Input.html">API de libGDX</a> para obter 
      mais informações sobre isso.
    </li>
  </ul>
  <ul>
    <li>
      A pesquisa de evento funcionará em eventos de entrada contínua (posição de clicks ou algo semelhante), mas não será eficiente para detectar 
      interações mais específicas do usuário como toques ou pressões em teclas, movimentos do dispositivo móvel ou comandos em páginas.<br>
      Para criar um manipulador eficiente de eventos de entrada, é preciso implementar <code>[implements]</code> a classe InputProcessor 
      (para usar todos os eventos possíveis) ou estender <code>[extends]</code> a classe InputAdapter (para usar apenas alguns eventos) e 
      então chamar a função <code>Gdx.input.setInputProcessor()</code> com seu manipulador de eventos.
    </li>
    <li>
      O código do segundo commit do arquivo principal cria uma nova instância da classe <code>InputAdapter</code> com as funções 
      <code>keyTyped()</code> e <code>touchDown()</code> para gerar valores aleatórios para as variáveis <code>r</code>, <code>g</code> 
      e <code>b</code>, que representam os tons das cores Vermelho, Verde e Azul que serão atribuídas ao plano de fundo na função 
      <code>render()</code>. Com isso, ao tocar/clicar na tela, ela ganhará uma nova cor de fundo.
    </li>
  </ul>
  <ul>
    <li>
      Ressalta-se também que libGDX também contém funções para obter eventos específicos para dispositivos móveis. Confira estes guias:
    </li>
    <ul>
      <li><a href="https://github.com/libgdx/libgdx/wiki/On-screen-keyboard">Teclados na tela (on-screen keyboards)<a></li>
      <li><a href="https://github.com/libgdx/libgdx/wiki/Gesture-detection">Gestos (gestures)</li>
      <li><a href="https://github.com/libgdx/libgdx/wiki/Accelerometer">Aceleradores (accelerometers)<a></li>
      <li><a href="https://github.com/libgdx/libgdx/wiki/Compass">Bússola (compass)<a></li>
      <li><a href="https://github.com/libgdx/libgdx/wiki/Vibrator">Vibração (vibration)<a></li>
    </ul>
  </ul>
</div>
