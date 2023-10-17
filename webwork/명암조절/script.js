// 스크롤을 감지할 이미지와 스크롤 컨테이너 요소 가져오기
const scrollImage = document.getElementById('scrollImage');
const scrollContainer = document.querySelector('.container');

// 이미지의 초기 밝기 설정
let brightness = 1;

// 스크롤 이벤트 리스너 등록
scrollContainer.addEventListener('scroll', () => {
  // 스크롤 위치 가져오기
  const scrollTop = scrollContainer.scrollTop;
  
  // 밝기를 스크롤 위치에 따라 조절 (0.5 이상 밝기가 떨어지지 않도록 설정)
  brightness = 1 - scrollTop / 300;
  brightness = Math.max(0.5, brightness);
  
  // 이미지의 밝기 조절
  scrollImage.style.filter = `brightness(${brightness})`;
});
