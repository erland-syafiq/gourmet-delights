import React from 'react';
import './Login.css'; 

function Login() {
  const handleLoginClick = () => {
    window.open('about:blank', '_blank'); 
  };

  return (
    <button className="login-button" onClick={handleLoginClick}>Login</button>
  );
}

export default Login;
