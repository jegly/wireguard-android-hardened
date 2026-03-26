package com.wireguard.android.activity;

@kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 B2\u00020\u0001:\u0004ABCDB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010*\u001a\u00020+H\u0002J\u0012\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u0002002\u0006\u00104\u001a\u00020\u0010H\u0016J\u000e\u00107\u001a\u000208H\u0082@\u00a2\u0006\u0002\u00109J\u000e\u0010:\u001a\u00020+H\u0082@\u00a2\u0006\u0002\u00109J\u000e\u0010;\u001a\u00020+H\u0082@\u00a2\u0006\u0002\u00109J\u0012\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020\fH\u0002J\u0012\u0010?\u001a\u0004\u0018\u00010\n2\u0006\u0010@\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\n \u0012*\u0004\u0018\u00010\f0\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010\u001f\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b \u0010\u001aR\u001b\u0010\"\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b#\u0010\u001aR\u001b\u0010%\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010\u0016\u001a\u0004\b&\u0010\u001aR\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "binding", "Lcom/wireguard/android/databinding/LogViewerActivityBinding;", "logAdapter", "Lcom/wireguard/android/activity/LogViewerActivity$LogEntryAdapter;", "logLines", "Landroidx/collection/CircularArray;", "Lcom/wireguard/android/activity/LogViewerActivity$LogLine;", "rawLogLines", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "saveButton", "Landroid/view/MenuItem;", "year", "kotlin.jvm.PlatformType", "getYear", "()Ljava/lang/String;", "year$delegate", "Lkotlin/Lazy;", "defaultColor", "", "getDefaultColor", "()I", "defaultColor$delegate", "debugColor", "getDebugColor", "debugColor$delegate", "errorColor", "getErrorColor", "errorColor$delegate", "infoColor", "getInfoColor", "infoColor$delegate", "warningColor", "getWarningColor", "warningColor$delegate", "lastUri", "Landroid/net/Uri;", "revokeLastUri", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "downloadsFileSaver", "Lcom/wireguard/android/util/DownloadsFileSaver;", "rawLogBytes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLog", "streamingLog", "parseTime", "Ljava/util/Date;", "timeStr", "parseLine", "line", "LogLine", "Companion", "LogEntryAdapter", "ExportedLogContentProvider", "ui_release"})
public final class LogViewerActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.wireguard.android.databinding.LogViewerActivityBinding binding;
    private com.wireguard.android.activity.LogViewerActivity.LogEntryAdapter logAdapter;
    @org.jetbrains.annotations.NotNull()
    private androidx.collection.CircularArray<com.wireguard.android.activity.LogViewerActivity.LogLine> logLines;
    @org.jetbrains.annotations.NotNull()
    private androidx.collection.CircularArray<java.lang.String> rawLogLines;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    @org.jetbrains.annotations.Nullable()
    private android.view.MenuItem saveButton;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy year$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy defaultColor$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy debugColor$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy errorColor$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy infoColor$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy warningColor$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri lastUri;
    @org.jetbrains.annotations.NotNull()
    private final com.wireguard.android.util.DownloadsFileSaver downloadsFileSaver = null;
    
    /**
     * Match a single line of `logcat -v threadtime`, such as:
     *
     * <pre>05-26 11:02:36.886 5689 5689 D AndroidRuntime: CheckJNI is OFF.</pre>
     */
    @org.jetbrains.annotations.NotNull()
    private static final java.util.regex.Pattern THREADTIME_LINE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, byte[]> LOGS = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TAG = "WireGuard/LogViewerActivity";
    @org.jetbrains.annotations.NotNull()
    public static final com.wireguard.android.activity.LogViewerActivity.Companion Companion = null;
    
    public LogViewerActivity() {
        super();
    }
    
    private final java.lang.String getYear() {
        return null;
    }
    
    private final int getDefaultColor() {
        return 0;
    }
    
    private final int getDebugColor() {
        return 0;
    }
    
    private final int getErrorColor() {
        return 0;
    }
    
    private final int getInfoColor() {
        return 0;
    }
    
    private final int getWarningColor() {
        return 0;
    }
    
    private final void revokeLastUri() {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final java.lang.Object rawLogBytes(kotlin.coroutines.Continuation<? super byte[]> $completion) {
        return null;
    }
    
    private final java.lang.Object saveLog(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object streamingLog(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.util.Date parseTime(java.lang.String timeStr) {
        return null;
    }
    
    private final com.wireguard.android.activity.LogViewerActivity.LogLine parseLine(java.lang.String line) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity$Companion;", "", "<init>", "()V", "THREADTIME_LINE", "Ljava/util/regex/Pattern;", "LOGS", "", "", "", "TAG", "ui_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016JO\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\r\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J;\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000eH\u0016\u00a2\u0006\u0002\u0010\u0018J1\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\u0010\u0011\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000eH\u0016\u00a2\u0006\u0002\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J%\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u000fH\u0016\u00a2\u0006\u0002\u0010\u001eJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000fH\u0016\u00a8\u0006\""}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity$ExportedLogContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "logForUri", "", "uri", "Landroid/net/Uri;", "insert", "values", "Landroid/content/ContentValues;", "query", "Landroid/database/Cursor;", "projection", "", "", "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "onCreate", "", "update", "", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "getStreamTypes", "mimeTypeFilter", "(Landroid/net/Uri;Ljava/lang/String;)[Ljava/lang/String;", "openFile", "Landroid/os/ParcelFileDescriptor;", "mode", "ui_release"})
    public static final class ExportedLogContentProvider extends android.content.ContentProvider {
        
        public ExportedLogContentProvider() {
            super();
        }
        
        private final byte[] logForUri(android.net.Uri uri) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public android.net.Uri insert(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        android.content.ContentValues values) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public android.database.Cursor query(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        java.lang.String[] projection, @org.jetbrains.annotations.Nullable()
        java.lang.String selection, @org.jetbrains.annotations.Nullable()
        java.lang.String[] selectionArgs, @org.jetbrains.annotations.Nullable()
        java.lang.String sortOrder) {
            return null;
        }
        
        @java.lang.Override()
        public boolean onCreate() {
            return false;
        }
        
        @java.lang.Override()
        public int update(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        android.content.ContentValues values, @org.jetbrains.annotations.Nullable()
        java.lang.String selection, @org.jetbrains.annotations.Nullable()
        java.lang.String[] selectionArgs) {
            return 0;
        }
        
        @java.lang.Override()
        public int delete(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        java.lang.String selection, @org.jetbrains.annotations.Nullable()
        java.lang.String[] selectionArgs) {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.String getType(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public java.lang.String[] getStreamTypes(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.NotNull()
        java.lang.String mimeTypeFilter) {
            return null;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.Nullable()
        public android.os.ParcelFileDescriptor openFile(@org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.NotNull()
        java.lang.String mode) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u0013B\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u0007H\u0016J \u0010\u000b\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J \u0010\u000f\u001a\u00020\u00102\u000e\u0010\u0011\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0007H\u0016\u00a8\u0006\u0014"}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity$LogEntryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/wireguard/android/activity/LogViewerActivity$LogEntryAdapter$ViewHolder;", "Lcom/wireguard/android/activity/LogViewerActivity;", "<init>", "(Lcom/wireguard/android/activity/LogViewerActivity;)V", "levelToColor", "", "level", "", "getItemCount", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "ViewHolder", "ui_release"})
    final class LogEntryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.wireguard.android.activity.LogViewerActivity.LogEntryAdapter.ViewHolder> {
        
        public LogEntryAdapter() {
            super();
        }
        
        private final int levelToColor(java.lang.String level) {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public com.wireguard.android.activity.LogViewerActivity.LogEntryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        com.wireguard.android.activity.LogViewerActivity.LogEntryAdapter.ViewHolder holder, int position) {
        }
        
        @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity$LogEntryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "layout", "Landroid/view/View;", "isSingleLine", "", "<init>", "(Lcom/wireguard/android/activity/LogViewerActivity$LogEntryAdapter;Landroid/view/View;Z)V", "getLayout", "()Landroid/view/View;", "()Z", "setSingleLine", "(Z)V", "ui_release"})
        final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            @org.jetbrains.annotations.NotNull()
            private final android.view.View layout = null;
            private boolean isSingleLine;
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            android.view.View layout, boolean isSingleLine) {
                super(null);
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.View getLayout() {
                return null;
            }
            
            public final boolean isSingleLine() {
                return false;
            }
            
            public final void setSingleLine(boolean p0) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00d6\u0001J\t\u0010#\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Lcom/wireguard/android/activity/LogViewerActivity$LogLine;", "", "pid", "", "tid", "time", "Ljava/util/Date;", "level", "", "tag", "msg", "<init>", "(IILjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPid", "()I", "getTid", "getTime", "()Ljava/util/Date;", "getLevel", "()Ljava/lang/String;", "getTag", "getMsg", "setMsg", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "ui_release"})
    static final class LogLine {
        private final int pid = 0;
        private final int tid = 0;
        @org.jetbrains.annotations.Nullable()
        private final java.util.Date time = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String level = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String tag = null;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String msg;
        
        public LogLine(int pid, int tid, @org.jetbrains.annotations.Nullable()
        java.util.Date time, @org.jetbrains.annotations.NotNull()
        java.lang.String level, @org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            super();
        }
        
        public final int getPid() {
            return 0;
        }
        
        public final int getTid() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date getTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getLevel() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTag() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMsg() {
            return null;
        }
        
        public final void setMsg(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component6() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.wireguard.android.activity.LogViewerActivity.LogLine copy(int pid, int tid, @org.jetbrains.annotations.Nullable()
        java.util.Date time, @org.jetbrains.annotations.NotNull()
        java.lang.String level, @org.jetbrains.annotations.NotNull()
        java.lang.String tag, @org.jetbrains.annotations.NotNull()
        java.lang.String msg) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}