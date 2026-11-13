<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>MUQADAS AI – Your Personal Intelligent Assistant</title>
<meta name="description" content="MUQADAS AI is a private personal assistant that understands Urdu and English.">
<link rel="icon" href="data:image/svg+xml,<svg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 100 100'><circle cx='50' cy='50' r='40' fill='none' stroke='%23D4AF37' stroke-width='8'/><circle cx='50' cy='50' r='14' fill='%2310B981'/></svg>">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Cormorant+Garamond:wght@500;600&family=Outfit:wght@300;400;500&family=Noto+Nastaliq+Urdu&display=swap" rel="stylesheet">
<style>
:root{
  --navy:#050B1A; --deep:#0A1530; --emerald:#10B981; --cyan:#22D3EE; --gold:#D4AF37; --silver:#C9D1D9; --muted:#8B9AB5;
  --line:rgba(34,211,238,.18);
}
*{box-sizing:border-box;margin:0}
html{scroll-behavior:smooth}
body{background:radial-gradient(ellipse at 50% 0%,#0B1B3D 0%,var(--navy) 55%,#000 100%) fixed;color:var(--silver);
  font-family:'Outfit',system-ui,sans-serif;font-weight:300;line-height:1.65;font-size:17px}
a{color:inherit}
:focus-visible{outline:2px solid var(--cyan);outline-offset:3px}
.wrap{max-width:1040px;margin:0 auto;padding:0 24px}
nav{display:flex;justify-content:space-between;align-items:center;padding:22px 0}
.brand{font-family:'Cormorant Garamond',Georgia,serif;font-size:1.5rem;letter-spacing:.18em;color:var(--gold);text-decoration:none}
nav ul{display:flex;gap:26px;list-style:none;padding:0}
nav a{text-decoration:none;color:var(--muted);font-size:.95rem}
nav a:hover{color:var(--cyan)}

/* hero */
.hero{display:grid;grid-template-columns:1.1fr .9fr;gap:40px;align-items:center;padding:56px 0 80px}
h1{font-family:'Cormorant Garamond',Georgia,serif;font-weight:500;font-size:clamp(2.6rem,6vw,4.6rem);line-height:1.05;color:#fff}
.tag{color:var(--emerald);margin:18px 0 8px;font-size:1.1rem}
.greet{min-height:3.2rem;font-size:1.25rem;color:var(--silver)}
.greet[lang=ur]{font-family:'Noto Nastaliq Urdu',serif;direction:rtl;text-align:left;line-height:2.2}
.row{display:flex;gap:12px;flex-wrap:wrap;margin-top:22px}
button,.btn{font:inherit;cursor:pointer;border-radius:999px;padding:11px 24px;text-decoration:none;display:inline-block}
.btn{background:var(--emerald);color:#03120C;border:0;font-weight:500}
.btn:hover{background:#34d399}
.ghost{background:transparent;color:var(--silver);border:1px solid var(--line)}
.ghost:hover,.ghost[aria-pressed=true]{border-color:var(--gold);color:var(--gold)}
.hud{width:100%;max-width:380px;justify-self:center;aspect-ratio:1}
.hud svg{width:100%;height:100%;overflow:visible}
.spin{transform-origin:200px 200px;animation:spin 28s linear infinite}
.spin.r{animation-duration:42s;animation-direction:reverse}
.pulse{transform-origin:200px 200px;animation:pulse 3.2s ease-in-out infinite}
@keyframes spin{to{transform:rotate(360deg)}}
@keyframes pulse{50%{transform:scale(1.06);opacity:.75}}

section{padding:64px 0;border-top:1px solid var(--line)}
h2{font-family:'Cormorant Garamond',Georgia,serif;font-weight:500;font-size:2.2rem;color:#fff;margin-bottom:10px}
.lead{color:var(--muted);max-width:60ch;margin-bottom:32px}
.cols{display:grid;grid-template-columns:repeat(auto-fit,minmax(260px,1fr));gap:34px}
.cols h3{font-weight:500;color:var(--cyan);font-size:1.05rem;margin-bottom:6px}
.cols p{color:var(--silver);font-size:.97rem}

table{width:100%;border-collapse:collapse;font-size:.97rem}
th,td{text-align:left;padding:12px 10px;border-bottom:1px solid var(--line);vertical-align:top}
th{color:var(--muted);font-weight:400}
.s{white-space:nowrap}
.s.done{color:var(--emerald)} .s.soon{color:var(--gold)} .s.plan{color:var(--muted)}
.scroll{overflow-x:auto}

.safe{display:grid;grid-template-columns:repeat(auto-fit,minmax(220px,1fr));gap:0}
.safe div{padding:18px 24px 18px 0;border-left:2px solid var(--gold);padding-left:18px;margin:0 20px 16px 0}
.safe b{display:block;color:#fff;font-weight:500}
footer{padding:36px 0 50px;color:var(--muted);font-size:.9rem;border-top:1px solid var(--line)}

@media(max-width:760px){
  .hero{grid-template-columns:1fr;padding-top:24px}
  .hud{max-width:260px;order:-1}
  nav ul{gap:16px}
}
@media(prefers-reduced-motion:reduce){.spin,.pulse{animation:none}html{scroll-behavior:auto}}
</style>
</head>
<body>
<div class="wrap">
  <nav>
    <a class="brand" href="#top">MUQADAS AI</a>
    <ul>
      <li><a href="#about">About</a></li>
      <li><a href="#status">Progress</a></li>
      <li><a href="#safety">Safety</a></li>
    </ul>
  </nav>

  <header class="hero" id="top">
    <div>
      <h1>MUQADAS AI</h1>
      <p class="tag">Your Personal Intelligent Assistant</p>
      <p class="greet" id="greet" lang="en" aria-live="polite">Assalamualaikum! How can I help you today?</p>
      <div class="row">
        <a class="btn" href="#status">See what works today</a>
        <button class="ghost" id="lang" aria-pressed="false">اردو میں دیکھیں</button>
      </div>
    </div>
    <div class="hud" aria-hidden="true">
      <svg viewBox="0 0 400 400">
        <defs><radialGradient id="core"><stop offset="0" stop-color="#10B981" stop-opacity=".9"/><stop offset="1" stop-color="#10B981" stop-opacity="0"/></radialGradient></defs>
        <circle class="pulse" cx="200" cy="200" r="70" fill="url(#core)"/>
        <circle cx="200" cy="200" r="46" fill="none" stroke="#22D3EE" stroke-width="2"/>
        <g class="spin" fill="none" stroke-width="3">
          <circle cx="200" cy="200" r="100" stroke="#22D3EE" stroke-dasharray="90 40 20 40"/>
          <circle cx="200" cy="200" r="135" stroke="#D4AF37" stroke-dasharray="150 60"/>
        </g>
        <g class="spin r" fill="none" stroke-width="2">
          <circle cx="200" cy="200" r="168" stroke="#10B981" stroke-dasharray="6 10"/>
          <circle cx="200" cy="200" r="188" stroke="#C9D1D9" stroke-opacity=".4" stroke-dasharray="40 80"/>
        </g>
      </svg>
    </div>
  </header>

  <section id="about">
    <h2>One assistant, for one owner</h2>
    <p class="lead">MUQADAS understands Urdu and English, answers questions, helps with writing and study, and is designed to carry out approved tasks on the owner's own phone and computers.</p>
    <div class="cols">
      <div><h3>Speak naturally</h3><p>Talk in Urdu, English or a mix of both. Replies appear as text and can be read aloud.</p></div>
      <div><h3>Ask for help</h3><p>Explain a topic, draft an email, translate, summarize or check a calculation.</p></div>
      <div><h3>Control your devices</h3><p>Open apps, change settings and set reminders on your Android phone. Computer control comes later through a separate Windows companion.</p></div>
    </div>
  </section>

  <section id="status">
    <h2>What works today</h2>
    <p class="lead">This list is kept honest. A feature is marked "Working" only after it has been built and tested.</p>
    <div class="scroll">
    <table>
      <thead><tr><th>Part</th><th>Status</th><th>Notes</th></tr></thead>
      <tbody>
        <tr><td>Website</td><td class="s done">Working</td><td>This page.</td></tr>
        <tr><td>Private dashboard and login</td><td class="s soon">Built, needs testing</td><td>Login is stored only in your browser for now.</td></tr>
        <tr><td>AI chat and voice</td><td class="s soon">Built, needs testing</td><td>Speech recognition needs Chrome or Edge.</td></tr>
        <tr><td>Android app</td><td class="s soon">Code written, not built</td><td>Must be compiled in Android Studio and tested on the phone.</td></tr>
        <tr><td>Windows PC and laptop companion</td><td class="s plan">Planned</td><td>Needs a separate app and a secure server.</td></tr>
        <tr><td>Phone-to-computer control</td><td class="s plan">Planned</td><td>Depends on the server and the Windows companion.</td></tr>
      </tbody>
    </table>
    </div>
  </section>

  <section id="safety">
    <h2>Built to stay private</h2>
    <div class="safe">
      <div><b>Single owner</b>No public sign-up.</div>
      <div><b>Asks first</b>Confirmation before messages, deletions or purchases.</div>
      <div><b>Emergency STOP</b>Cancels the microphone, speech and pending actions.</div>
      <div><b>No pretending</b>If a task fails or isn't supported, MUQADAS says so.</div>
    </div>
  </section>

  <footer>© <span id="y">2026</span> MUQADAS AI. Private project.</footer>
</div>

<script>
(function(){
  var g=document.getElementById('greet'), b=document.getElementById('lang'), ur=false;
  var T={
    en:{t:'Assalamualaikum! How can I help you today?',b:'اردو میں دیکھیں'},
    ur:{t:'السلام علیکم! آج میں آپ کی کیا مدد کر سکتی ہوں؟',b:'View in English'}
  };
  b.addEventListener('click',function(){
    ur=!ur; var k=ur?'ur':'en';
    g.textContent=T[k].t; g.setAttribute('lang',k);
    b.textContent=T[k].b; b.setAttribute('aria-pressed',ur);
  });
  document.getElementById('y').textContent=new Date().getFullYear();
})();
</script>
</body>
</html>
