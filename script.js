function openGithub(){window.open("https://github.com/Shailesh-745")}
function openLinkedin(){window.open("https://www.linkedin.com/in/shailesh-kamble-42a3a3284/?skipRedirect=true")}
function openResume(){window.open("resume.pdf")}

const elements=document.querySelectorAll('.fade');
window.addEventListener('scroll',()=>{
elements.forEach(el=>{
const pos=el.getBoundingClientRect().top;
if(pos<window.innerHeight-100){el.classList.add('show')}
})
});
// hover sound or animation optional future use
console.log("Skills Loaded");
function toggleMenu(){
  document.getElementById("menu").classList.toggle("active");
}
const links = document.querySelectorAll("#menu a");

links.forEach(link=>{
  link.addEventListener("click",()=>{
    document.getElementById("menu").classList.remove("active");
  });
});
// SOURCE CODE LINKS
function openProject(type){

  if(type === "travel"){
    window.open("https://github.com/Shailesh-745/The-AI-Based-Smart-Travel-Planner");
  }

  if(type === "grocery"){
    window.open("https://github.com/Shailesh-745/grocery-billing-system");
  }

  if(type === "marksheet"){
    window.open("https://github.com/Shailesh-745/marksheet-system");
  }
}

// PROJECT REPORT LINKS
function openReport(type){

  if(type === "travel"){
    window.open("travel-report.pdf");
  }

  if(type === "grocery"){
    window.open("grocery-report.pdf");
  }

  if(type === "marksheet"){
    window.open("marksheet-report.pdf");
  }
}
window.addEventListener("load", function(){
  document.getElementById("loader").style.display = "none";
});
function openModal(){
  document.getElementById("projectModal").style.display="block";
}

function closeModal(){
  document.getElementById("projectModal").style.display="none";
}
const timelineItems = document.querySelectorAll(".timeline-item");

window.addEventListener("scroll", ()=>{
  timelineItems.forEach(item=>{
    const pos = item.getBoundingClientRect().top;
    if(pos < window.innerHeight - 100){
      item.style.opacity = "1";
      item.style.transform = "translateY(0)";
    }
  });
});
const sections = document.querySelectorAll("section");
const navLinks = document.querySelectorAll("nav ul li a");

window.addEventListener("scroll", ()=>{
  let current = "";

  sections.forEach(sec=>{
    const top = sec.offsetTop;
    if(pageYOffset >= top - 100){
      current = sec.getAttribute("id");
    }
  });

  navLinks.forEach(a=>{
    a.classList.remove("active");
    if(a.getAttribute("href") === "#" + current){
      a.classList.add("active");
    }
  });
});