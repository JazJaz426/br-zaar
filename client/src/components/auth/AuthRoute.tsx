import { useState } from "react";
import { getLoginId } from "../../utils/cookie";
import LoginLogout from "./LoginLogout";

interface AuthRouteProps {
  gatedContent: React.ReactNode;
}

function AuthRoute(props: AuthRouteProps) {
  const [loggedIn, setLogin] = useState(false);
  console.log("Environment:", import.meta.env.VITE_APP_NODE_ENV);
  // SKIP THE LOGIN BUTTON IF YOU HAVE ALREADY LOGGED IN.
  if (!loggedIn && getLoginId() !== undefined) {
    setLogin(true);
  }

  if (!loggedIn && import.meta.env.VITE_APP_NODE_ENV === "test") {
    setLogin(true);
  }
  return (
    <>
      <LoginLogout loggedIn={loggedIn} setLogin={setLogin} />

      {loggedIn ? props.gatedContent : null}
    </>
  );
}

export default AuthRoute;
