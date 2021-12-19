/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise.ProdiTI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alamnurcahaya
 */

@Controller
public class Tugas {
    
    @RequestMapping("/dataktp")
    public String getTable (Model ktp) {
        
        ArrayList<List<String>> data = new ArrayList ();
        
        data.add(Arrays.asList("20211001","340102109080003", "Handika", "Salatiga"));
        data.add(Arrays.asList("20211002","340102109080007", "Budi", "Himalaya"));
        data.add(Arrays.asList("20211003","340102109080036", "Santoso", "Ohio"));
        data.add(Arrays.asList("20211004","340102109080064", "Dani", "Depok"));
        data.add(Arrays.asList("20211005","340102109080088", "Alfredo", "Bekasi"));
        data.add(Arrays.asList("20211006","340102109080036", "Evelyn", "Bogor"));
        data.add(Arrays.asList("20211007","340102109080056", "Sinta", "Tangerang"));
        data.add(Arrays.asList("20211008","340102109080087", "Desi", "Jakarta"));
        data.add(Arrays.asList("20211009","340102109080022", "Amadea", "Sleman"));
        data.add(Arrays.asList("20211010","340102109080014", "Jasmine", "Bantul"));
        data.add(Arrays.asList("20211011","340102109080053", "Kiki", "Banjar"));
        data.add(Arrays.asList("20211012","340102109080021", "Siregar", "Pali"));
        data.add(Arrays.asList("20211013","340102109080009", "Rara", "Pakualaman"));
        data.add(Arrays.asList("20211014","340102109080090", "Teruna", "Cirebon"));
        data.add(Arrays.asList("20211015","340102109080067", "Zahra", "Solo"));
        data.add(Arrays.asList("20211016","340102109080088", "Vina", "Badui"));
        data.add(Arrays.asList("20211017","340102109080093", "Fafa", "Bali"));
        data.add(Arrays.asList("20211018","340102109080026", "Leni", "Semarang"));
        data.add(Arrays.asList("20211019","340102109080056", "Astuti", "Seminyak"));
        data.add(Arrays.asList("20211020","340102109080065", "Ariel", "Wonogiri"));
        
        ktp.addAttribute("table", data);
        
        return "table";
    }
}