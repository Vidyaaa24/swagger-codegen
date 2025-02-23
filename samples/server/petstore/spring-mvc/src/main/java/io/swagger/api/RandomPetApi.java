/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.35-SNAPSHOT).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.SinglePetResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Validated
@Api(value = "randomPet", description = "the randomPet API")
public interface RandomPetApi {

    @ApiOperation(value = "", nickname = "getRandomPet", notes = "", response = SinglePetResponse.class, tags={ "pet", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "a single random pet", response = SinglePetResponse.class) })
    @RequestMapping(value = "/randomPet",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<SinglePetResponse> getRandomPet();

}

