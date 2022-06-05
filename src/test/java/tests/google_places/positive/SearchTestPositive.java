package tests.google_places.positive;

import api.models.google_places.GooglePlacesModel;
import base.BaseTest;
import io.restassured.http.Method;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTestPositive extends BaseTest {

    @Test(description = "searth some object", dataProvider = "searthText")
    public void searthPlaceWithText(String input, String inputtype){
        GooglePlacesModel.RequestModel requestModel = GooglePlacesModel.RequestModel.builder()
                .input(input)
                .inputtype(inputtype)
                .build();
        apiManager.getGooglePlacesModel().searth(requestModel, Method.GET, 200);
    }
    @DataProvider
    public Object[] [] searthText(){
        return new Object[][]{
        {"new york","textquery"}
        };
    }
}
