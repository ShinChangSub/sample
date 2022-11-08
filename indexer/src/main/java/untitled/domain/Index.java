package untitled.domain;

import untitled.domain.FileIdexed;
import untitled.IndexerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Index_table")
@Data

public class Index  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        FileIdexed fileIdexed = new FileIdexed(this);
        fileIdexed.publishAfterCommit();

    }

    public static IndexRepository repository(){
        IndexRepository indexRepository = IndexerApplication.applicationContext.getBean(IndexRepository.class);
        return indexRepository;
    }




    public static void index(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

        
    }


}
