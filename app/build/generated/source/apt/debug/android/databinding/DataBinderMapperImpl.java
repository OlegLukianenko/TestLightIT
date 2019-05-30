package android.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new lightIT.test.application.DataBinderMapperImpl());
  }
}
