package com.example.tasks.service.repository.local;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.tasks.service.model.PriorityModel;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class IPriorityDAO_Impl implements IPriorityDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PriorityModel> __insertionAdapterOfPriorityModel;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public IPriorityDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPriorityModel = new EntityInsertionAdapter<PriorityModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `priority` (`id`,`Description`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PriorityModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM priority";
        return _query;
      }
    };
  }

  @Override
  public void save(final List<PriorityModel> list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPriorityModel.insert(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void clear() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfClear.release(_stmt);
    }
  }
}
