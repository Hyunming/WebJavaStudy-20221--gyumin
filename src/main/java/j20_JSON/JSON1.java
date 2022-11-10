package j20_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JSON1 {
    public static void main(String[] args){
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("username","junil");
        jsonObject.addProperty("password","1234");
        jsonObject.addProperty("email","kgm5371@naber.com");//키값과 문자열으 ㄴ무조건"이거 써야함
        jsonObject.addProperty("name","김준일");
        jsonObject.addProperty("age",29);

        System.out.println(jsonObject);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonObject);
        System.out.println(json);
    }
}
