package kodlama.io.devs2.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProgrammingLanguageRequest {
    private String programmingLanguageName;
}
