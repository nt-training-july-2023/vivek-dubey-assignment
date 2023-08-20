function validateForm() {
    const firstname = document.getElementById("firstname").value;
    const lastname = document.getElementById("lastname").value;
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;
    const confirmPassword = document.getElementById("confirm-password").value;
    const mobileNumber = document.getElementById("mobile-number").value;
    const gender = document.querySelector('input[name="gender"]:checked');
  
    if (firstname === "") {
      alert("Firstname is mandatory in order to register");
      return false;
    }

    if (lastname === "") {
        alert("Lastname is mandatory in order to register");
        return false;
      }
    
    if (mobileNumber === "") {
        alert("Mobile number is mandatory in order to register");
        return false;
      }

    if (email === "") {
      alert("Email is mandatory in order to register");
      return false;
    }
  
    if (password === "") {
      alert("Password is mandatory in order to register");
      return false;
    }
  
    if (confirmPassword === "") {
      alert("Confirm password is mandatory in order to register");
      return false;
    }
  
    if (password !== confirmPassword) {
      alert("Passwords do not match");
      return false;
    }
  
  
    if (!gender) {
      alert("Gender must be selected");
      return false;
    }
  }