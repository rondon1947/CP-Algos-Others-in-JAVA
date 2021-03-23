#include<bits/stdc++.h>

using namespace std;

#define ll long long int

#define s(x) scanf("%lld",&x)
#define s3(x,y,z) s(x)+s(y)+s(z)

#define p(x) printf("%lld\n",x)
#define F(i,a,b) for(ll i = (ll)(a); i <= (ll)(b); i++)

#define pll pair<ll,ll>
#define pb push_back

ll gcd(ll a , ll b){return b==0?a:gcd(b,a%b);}

vector<pair<ll,pll>> dims;
vector<ll> maxHtPossibleWithIthBoxAtTop;
vector<vector<ll>>adj;
vector<bool>vis;

void dfs(ll i){
    vis[i]=true;

    ll ans=dims[i].first;
    for(ll j=0;j<adj[i].size();j++){
        if(!vis[adj[i][j]])dfs(adj[i][j]);
        ans=max(ans,maxHtPossibleWithIthBoxAtTop[adj[i][j]]+dims[i].first);
    }
    maxHtPossibleWithIthBoxAtTop[i]=ans;
}

int main()
{
    ll t=1;
    s(t);
    while(t--){
        ll n;
        s(n);
        dims.clear();
        maxHtPossibleWithIthBoxAtTop.clear();
        adj.clear();
        vis.clear();

        F(i,0,n-1){
            ll h,w,b;
            vector<ll>temp;
            s3(h,w,b);
            temp.pb(h);temp.pb(w);temp.pb(b);
            sort(temp.begin(), temp.end());
            h=temp[0];
            w=temp[1];
            b=temp[2];
            dims.push_back({h,{w,b}});
            dims.push_back({w,{h,b}});
            dims.push_back({b,{h,w}});
        }

        adj.resize(dims.size());
        vis.resize(dims.size());
        maxHtPossibleWithIthBoxAtTop.resize(dims.size());

        for(ll i=0;i<dims.size();i++){
            for(ll j=0;j<dims.size();j++){
                if(i==j)continue;
                if(dims[i].second.first<dims[j].second.first){
                    if(dims[i].second.second<dims[j].second.second)
                        adj[i].push_back(j);
                }
            }
        }

        for(ll i=0;i<dims.size();i++){
            if(vis[i])continue;
            dfs(i);
        }

        ll ans=0;
        for(long long & i : maxHtPossibleWithIthBoxAtTop)
            ans=max(ans,i);

        p(ans);
    }
}