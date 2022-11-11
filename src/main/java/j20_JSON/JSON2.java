package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@Data
class User {
    private String username;
    private String password;
    private String email;
    private String name;
}
public class JSON2 {
    public  static void main(String[] args) {
        // Gson 으로 변환 할수있는객체의 종류
        // JsonObject , Object ,Map

        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();// 밑에거랑같다 근데 이게 프리티프린팅 같을걸 설정할수있으니 되도록이걸쓰자
        Gson gson2 = new Gson();

        String userJson = null;
        String studentJson = null;
        String productJson = null;
        //Object(객체)->JSON
        User user = new User("junil","1234","kgm0986@naver.com","김규민");
        System.out.println(user);
        System.out.println(gsonBuilder.toJson(user));
        System.out.println(gson2.toJson(user));
        userJson = gsonBuilder.toJson(user);
        // JsonObject -> JSON
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("studentCode", "20220001");
        jsonObject.addProperty("studentName", "김준이");
        jsonObject.addProperty("studentyear", "2");
        System.out.println(gsonBuilder.toJson(jsonObject));
        studentJson = gsonBuilder.toJson(jsonObject);

        // MAP -> JSON
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("productCode", "P-20220001");
        map.put("producName", "삼성 노트북");
        System.out.println(gsonBuilder.toJson(map));
        productJson = gsonBuilder.toJson(map);

        Map<String,Object> jsonData = convertJsonToMap(userJson);
        System.out.println(jsonData.get("name"));
      //  System.out.println("....");

        jsonData = convertJsonToMap(studentJson);
        System.out.println(jsonData);

        jsonData = convertJsonToMap(productJson);
        System.out.println(jsonData);
        // JSon -> jsonObject
        JsonObject jsonObj = convertJsonToJsonObject(userJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(studentJson);
        System.out.println(jsonObj);

        jsonObj = convertJsonToJsonObject(productJson);
        System.out.println(jsonObj);

        //JSON -> User
        User userObj = convertJsonToUser(userJson);
        System.out.println(userObj);



    }
    public static Map convertJsonToMap(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, Map.class);//앞에는 변환되는것 뒤에는 변환해주고싶은 값을 넣어주면된다
    }
    public static JsonObject convertJsonToJsonObject(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, JsonObject.class);//앞에는 변환되는것 뒤에는 변환해주고싶은 값을 넣어주면된다
    }

    public static User convertJsonToUser(String json){
        Gson gson = new Gson();
        return gson.fromJson(json, User.class);
    }
}
