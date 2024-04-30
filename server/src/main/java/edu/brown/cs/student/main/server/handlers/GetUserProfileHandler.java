package edu.brown.cs.student.main.server.handlers;

import edu.brown.cs.student.main.server.storage.StorageInterface;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;
import spark.Route;

public class GetUserProfileHandler implements Route {
  private static final Logger logger = LoggerFactory.getLogger(GetUserProfileHandler.class);
  private StorageInterface storage;

  public GetUserProfileHandler(StorageInterface storage) {
    this.storage = storage;
  }

  @Override
  public Object handle(Request request, Response response) throws Exception {
    String email = request.queryParams("email");
    Map<String, Object> responseMap = new HashMap<>();
    if (email == null) {
      responseMap.put("status", 400);
      responseMap.put("message", "User email is required");
      return Utils.toMoshiJson(responseMap);
    }

    Map<String, Object> userProfile = storage.getUserDocumentByEmail(email);
    if (userProfile == null) {
      responseMap.put("status", 404);
      responseMap.put("message", "User not found");
      return Utils.toMoshiJson(responseMap);
    }

    responseMap.put("status", 200);
    responseMap.put("data", userProfile);
    return Utils.toMoshiJson(responseMap);
  }
}
